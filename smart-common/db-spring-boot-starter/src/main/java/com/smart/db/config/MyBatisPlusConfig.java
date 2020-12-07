package com.smart.db.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author kun
 * @date 2020/12/7 14:30
 */
@Configuration
@MapperScan("com.smart.**.mapper")
public class MyBatisPlusConfig {
    @Bean
    @Primary
    public PaginationInterceptor interceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLimit(50L);
        //超过最大页数进行智能转化
        paginationInterceptor.setOverflow(true);
        return paginationInterceptor;
    }
}
