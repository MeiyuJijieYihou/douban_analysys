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
        for(User user: users) {
            if (JudgeGenderUtil.isFemale(user.getId())) {
                user.setInferred_sex(true);
                userMapper.updateByPrimaryKeySelective(user);
            }
            else{
                user.setInferred_sex(false);
                userMapper.updateByPrimaryKeySelective(user);
            }

            System.out.println(user.getId());
            System.out.println(JudgeGenderUtil.isFemale(user.getId()));
        }
    }
}
