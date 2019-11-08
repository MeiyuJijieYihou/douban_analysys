package com.yiguan.douban.mapper;

import java.util.List;

/**
 * Description: 操作movie_region数据库表
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 下午9:35
 * @since JDK 1.8
 */
public interface MovieRegionMapper {

    List<String> selectCountriesRegionsByMovieId(Integer id);

}
