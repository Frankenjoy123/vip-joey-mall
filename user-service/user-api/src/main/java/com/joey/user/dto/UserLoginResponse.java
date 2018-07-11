package com.joey.user.dto;

import com.joey.user.abs.AbstractResponse;

import java.io.Serializable;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/6.
 */
public class UserLoginResponse extends AbstractResponse{

    private static final long serialVersionUID = 6580280664368573541L;

    private Integer uid;
    private String avatar;
    private String mobile;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
