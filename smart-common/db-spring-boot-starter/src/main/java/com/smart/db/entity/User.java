package com.smart.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 *  @author kun
 *  @date   2020/12/7 15:00
 */
/**
    * 用户表
    */
@Data
@TableName(value = "`user`")
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 手机号
     */
    @TableField(value = "user_phone")
    private String userPhone;

    /**
     * 0为用户已存在，1为用户不存在
     */
    @TableField(value = "status")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_USER_PHONE = "user_phone";

    public static final String COL_STATUS = "status";
}