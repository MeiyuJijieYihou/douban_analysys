package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Address;
import com.yiguan.douban.mapper.AddressMapper;
import com.yiguan.douban.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @Auther: 乃攀
 * @Date: 2019/11/5 16:47
 * @Description:
 */

@Service
public class AddressServiceImpl implements AddressService {


    @Resource
    private AddressMapper addressMapper;

    @Override
    public List<Address> findAddress() {
        List<Address> list = new ArrayList<>();
        list = addressMapper.selectAll();
        return list;
    }
}
