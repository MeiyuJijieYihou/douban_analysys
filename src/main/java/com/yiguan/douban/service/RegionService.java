package com.yiguan.douban.service;


import com.yiguan.douban.entity.Region;

import java.util.List;

/**
 * @author Administrator
 * @Auther: 乃攀
 * @Date: 2019/11/5 16:46
 * @Description:
 */
public interface RegionService {
    /**
     *
     *获取所有的地址信息
     * @return
     */
    public List<Region> findRegion();

    /**
     * 通过id获取地址信息
     * @param id
     * @return
     */
    public Region getRegionById(Integer id);
}
