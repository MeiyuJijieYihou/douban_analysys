package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Comment;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Description: 操作comment数据库表
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:57
 * @since JDK 1.8
 */
public interface CommentMapper extends Mapper<Comment> {
    /**
     * description: 根据电影id查找最新的N/2条电影短评
     *
     * @params [id, num]
     * @return java.util.List<com.yiguan.douban.entity.Comment>
     * @author LiBingxiang
     * @date 2019/11/17 21:23
     */
    List<Comment> selectNewShortComments(@Param("id") Integer id, @Param("num") Integer num);

    /**
     * description: 根据电影id查找最新的N/2条电影影评
     *
     * @params [id, num]
     * @return java.util.List<com.yiguan.douban.entity.Comment>
     * @author LiBingxiang
     * @date 2019/11/17 21:27
     */
    List<Comment> selectNewComments(@Param("id") Integer id, @Param("num") Integer num);
}
