package com.yiguan.douban.service;

import com.yiguan.douban.entity.User;

import java.util.List;

/**
 * @Auther: 乃攀
 * @Date: 2019/11/5 16:46
 * @Description:
 */
public interface UserService {
    /**
     *
     * 获取所有用户信息
     * @return
     */
    public List<User> findAllUser();

    /**
     *
     * 通过用户id获取用户信息
     * @param id
     * @return
     */
    public User getUserById(String id);
}
