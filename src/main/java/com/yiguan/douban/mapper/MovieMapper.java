package com.yiguan.douban.mapper;

import com.yiguan.douban.pojo.MoviePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 操作movie数据库表
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:36
 * @since JDK 1.8
 */
public interface MovieMapper {

    /**
     * description: 查询所有的电影信息
     * 
     * @params []
     * @return java.util.List<com.yiguan.douban.entity.Movie>
     * @author LiBingxiang
     * @date 2019/11/10 11:40
     */
    List<MoviePojo> selectAllMovies();

    /**
     * description: 根据电影id查询电影信息
     *
     * @params [id]
     * @return com.yiguan.douban.pojo.MoviePojo
     * @author LiBingxiang
     * @date 2019/11/12 20:28
     */
    MoviePojo findMovieById(@Param("id") Integer id);

    /**
     * description: 查询出当前一周评论最多的N个亚洲区域视频降序排列
     *
     * @params [preTime, nowTime, num]
     * @return java.util.List<com.yiguan.douban.pojo.MoviePojo>
     * @author LiBingxiang
     * @date 2019/11/17 20:19
     */
    List<MoviePojo> selectTopMovies(@Param("preTime") String preTime, @Param("nowTime") String nowTime, @Param("num") Integer num);
}
