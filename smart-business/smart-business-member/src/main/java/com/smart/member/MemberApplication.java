package com.smart.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kun
 * @date 2020/12/7 14:42
 *
 * 文件服务
 * 权限 认证（登陆）操作权限  资源权限-- 菜单权限  url权限
 *
 * 需要用户id 必须要认证
 *
 * 设计权限系统 spring boot + shiro
 *              spring boot + security
 */
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
