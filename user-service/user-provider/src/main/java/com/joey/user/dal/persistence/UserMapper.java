package com.joey.user.dal.persistence;

import com.joey.user.dal.entity.User;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/7/7.
 */
public interface UserMapper {

    /**
     *
     * @return
     */
    User getUserByUserName(String userName);


    /**
     * 根据uid获取用户信息
     * @param uid
     * @return
     */
    User getUserByUid(Integer uid);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertSelective(User user);


}
