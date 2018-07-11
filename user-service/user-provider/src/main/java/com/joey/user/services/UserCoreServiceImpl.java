package com.joey.user.services;

import com.joey.user.IUserCoreService;
import com.joey.user.dto.UserLoginRequest;
import com.joey.user.dto.UserLoginResponse;
import org.springframework.stereotype.Service;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/7.
 */

@Service(value = "userCoreService")
public class UserCoreServiceImpl implements IUserCoreService {
    @Override
    public UserLoginResponse login(UserLoginRequest request) {
        return null;
    }
}
