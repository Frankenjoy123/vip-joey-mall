package com.joey.user;

import com.joey.user.dto.UserLoginRequest;
import com.joey.user.dto.UserLoginResponse;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/7.
 */
public interface IUserCoreService {

    /**
     * 用户登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);
}
