package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.User;
import com.yiguan.douban.mapper.UserMapper;
import com.yiguan.douban.service.UserService;
import com.yiguan.douban.util.JudgeGenderUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
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
    public List<User> selectUsers() {
        List<User> list = new ArrayList<>();
        list = userMapper.selectUsers();
        return list;
    }

    @Override
    public User getUserById(String id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public void setIsFemale() throws IOException, InterruptedException {
        List<User> users = selectUsers();
        for( int i = 0; i < 10; i++ ) {
            if (JudgeGenderUtil.isFemale(users.get(i).getId())) {
                
                userMapper.setIsFemale(users.get(i).getId());
            }
            else{
                userMapper.setIsMale(users.get(i).getId());
            }
            System.out.println(users.get(i).getId());
            System.out.println(JudgeGenderUtil.isFemale(users.get(i).getId()));
        }
    }
}
