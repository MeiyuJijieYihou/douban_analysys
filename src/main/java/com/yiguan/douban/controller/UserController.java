package com.yiguan.douban.controller;


import com.yiguan.douban.entity.User;
import com.yiguan.douban.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author 乃攀
 *
 * @date: 2019/11/5 16:43
 * @description:
 */
@RestController
@RequestMapping("/api/user")
@Api(description = "用户相关接口文档")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/h")
    @ApiOperation("测试显示")
    public String hello(){
        return "UserController Hello world!";
    }

    @GetMapping("/get")
    @ApiOperation("获取所有用户信息")
    public List<User> getAllUser() {
        List<User> list = userService.selectUsers();
        return list;
    }

    @GetMapping("/get/{id}")
    @ApiOperation("通过id获取用户信息")
    public User getUser(@PathVariable String id){
        return userService.getUserById(id);
    }

    @GetMapping("/test")
    @ApiOperation("jenkins自动化构建测试")
    public String testJenkins() {
        return "hello, this is jenkins test";
    }

    @GetMapping("/set/setIsFemale")
    @ApiOperation("设置用户是否为女性（Female:1）")
    public void setIsFemale() throws IOException, InterruptedException {
        userService.setIsFemale();
    }
}
