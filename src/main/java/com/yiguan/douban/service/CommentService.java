package com.yiguan.douban.service;

import com.yiguan.douban.entity.Comment;

import java.util.List;

/**
 * Description: 定义了操作评论表的方法
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:42
 * @since JDK 1.8
 */
public interface CommentService {

    /**
     * description: 查询所有评论
     *
     * @params []
     * @return java.util.List<com.yiguan.douban.entity.Comment>
     * @author LiBingxiang
     * @date 2019/11/12 19:42
     */
    List<Comment> findAllComment();

}
