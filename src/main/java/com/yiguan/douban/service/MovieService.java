package com.yiguan.douban.service;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.pojo.MoviePojo;

import java.util.List;

/**
 * Description: 定义了操作评论表的方法
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:43
 * @since JDK 1.8
 */
public interface MovieService {

    /**
     * description: 查询所有电影信息
     *
     * @params []
     * @return java.util.List<com.yiguan.douban.entity.Movie>
     * @author LiBingxiang
     * @date 2019/11/12 19:42
     */
    List<MoviePojo> findAllMovies();

    /**
     * description: 根据电影id查询电影信息
     *
     * @params [id]
     * @return com.yiguan.douban.entity.Movie
     * @author LiBingxiang
     * @date 2019/11/12 19:43
     */
    MoviePojo findMovieById(Integer id);

    /**
     * description: 查询出当前一周评论最多的N个亚洲区域视频降序排列
     *
     * @params [num]
     * @return java.util.List<com.yiguan.douban.pojo.MoviePojo>
     * @author LiBingxiang
     * @date 2019/11/17 20:15
     */
    List<MoviePojo> findTopMovies(Integer num);

    /**
     * description: 根据电影id查找最新的N/2条电影短评论和N/2条电影影评
     *
     * @params [id, num]
     * @return java.util.List<com.yiguan.douban.entity.Comment>
     * @author LiBingxiang
     * @date 2019/11/17 20:55
     */
    List<Comment> findNewComments(Integer id, Integer num);
}
