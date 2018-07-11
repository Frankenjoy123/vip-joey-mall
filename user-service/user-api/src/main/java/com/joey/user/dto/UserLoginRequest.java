package com.joey.user.dto;

import java.io.Serializable;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/6.
 */
public class UserLoginRequest implements Serializable{

    private static final long serialVersionUID = -3418387201212001243L;

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
