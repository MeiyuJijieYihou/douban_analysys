package com.yiguan.douban.mapper;

import java.util.List;

/**
 * @author abing
 * @create 2019/11/7 下午9:50
 */
public interface MovieRegionMapper {

    List<String> selectCountriesRegionsByMovieId(Integer id);

}
