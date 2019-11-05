package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Address;
import com.yiguan.douban.service.AddressService;
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
public class AddressController{

    @Autowired
    private AddressService addressService;

    @GetMapping("/h")
    public String hello(){
        return "BookController Hello world!";
    }

    @GetMapping("/get")
    public List<Address> getAddress(){
        List<Address> list = addressService.findAddress();
        return list;
    }
}
