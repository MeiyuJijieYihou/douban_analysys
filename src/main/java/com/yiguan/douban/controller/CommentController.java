package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: 对评论表进行操作
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 下午9:32
 * @since JDK 1.8
 */
@RequestMapping("/api/comment")
@RestController
@Api("评论相关接口文档")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/get")
    @ApiOperation("获取所有评论信息")
    public List<Comment> getAllComment() {
        return commentService.findAllComment();
    }
}
