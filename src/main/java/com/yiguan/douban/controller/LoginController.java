package com.yiguan.douban.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: 登录
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/22 20:24
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
@Api(description = "登录接口文档")
public class LoginController {

    @GetMapping({"/", "/index"})
    @ApiOperation("首页")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/login")
    @ApiOperation("登录页面")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("login");
        return mv;
    }

    @GetMapping("/admin")
    @ApiOperation("管理/测试页面")
    public ModelAndView admin(ModelAndView mv){
        mv.addObject("title","标题");
        mv.addObject("content","内容");
        mv.addObject("extraInfo","你是admin");
        mv.setViewName("admin");
        return mv;
    }
}
