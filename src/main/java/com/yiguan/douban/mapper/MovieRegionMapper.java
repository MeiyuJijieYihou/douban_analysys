package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.MovieRegion;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Description: 操作movie_region数据库表
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 下午9:35
 * @since JDK 1.8
 */
public interface MovieRegionMapper  extends Mapper<MovieRegion> {

    /*
     * @description 通过电影id查询电影信息
     *
     * @params [id]
     * @return java.util.List<java.lang.String>
     * @author LiBingxiang
     * @date 2019/11/10 上午11:41
     */
    List<String> selectCountriesRegionsByMovieId(Integer id);

}
