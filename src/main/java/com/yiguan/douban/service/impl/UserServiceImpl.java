package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.User;
import com.yiguan.douban.mapper.UserMapper;
import com.yiguan.douban.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 乃攀
 * @Date: 2019/11/5 16:47
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        List<User> list = new ArrayList<>();
        list = userMapper.selectAll();
        return list;
    }

    @Override
    public User getUserById(String id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
