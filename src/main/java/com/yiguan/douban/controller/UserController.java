package com.yiguan.douban.controller;


import com.yiguan.douban.entity.User;
import com.yiguan.douban.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 乃攀
 *
 * @date: 2019/11/5 16:43
 * @description:
 */
@RestController
@RequestMapping("/api/user")
@Api("用户相关接口文档")
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
    public List<User> getAllUser(){
        List<User> list = userService.findAllUser();
        return list;
    }
}
