package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Region;
import com.yiguan.douban.mapper.RegionMapper;
import com.yiguan.douban.service.RegionService;
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
public class RegionServiceImpl implements RegionService {

    @Resource
    private RegionMapper regionMapper;

    @Override
    public List<Region> findRegion() {
        List<Region> list = new ArrayList<>();
        list = regionMapper.selectAll();
        return list;
    }
}
