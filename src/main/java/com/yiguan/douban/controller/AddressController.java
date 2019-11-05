package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Address;
import com.yiguan.douban.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @Auther: 乃攀
 * @Date: 2019/11/5 16:18
 * @Description:
 */

@RestController
@RequestMapping("/api/address")
@Api(description = "地址相关接口文档")
public class AddressController{

    @Autowired
    private AddressService addressService;

    @GetMapping("/h")
    @ApiOperation("测试显示")
    public String hello(){
        return "BookController Hello world!";
    }

    @GetMapping("/get")
    @ApiOperation("获取所有地址")
    public List<Address> getAddress(){
        List<Address> list = addressService.findAddress();
        return list;
    }
}
