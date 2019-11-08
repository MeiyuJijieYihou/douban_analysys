package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Region;
import com.yiguan.douban.service.RegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/api/region")
@Api(description = "地址相关接口文档")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/h")
    @ApiOperation("测试显示")
    public String hello(){
        return "BookController Hello world!";
    }

    @GetMapping("/get")
    @ApiOperation("获取所有地址")
    public List<Region> getAddress(){
        List<Region> list = regionService.findRegion();
        return list;
    }

    @GetMapping("/get/{id}")
    @ApiOperation("通过id获取地址信息")
    public Region getRegion(@PathVariable Integer id){
        return regionService.getRegionById(id);
    }
}
