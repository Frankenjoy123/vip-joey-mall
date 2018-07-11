package com.joey.user.abs;

import java.io.Serializable;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/6.
 */
public class AbstractResponse implements Serializable {
    private static final long serialVersionUID = 5260212626381370207L;

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
