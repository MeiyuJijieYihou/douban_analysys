package com.yiguan.douban.controller;

import com.yiguan.douban.service.CommentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 对评论表进行操作
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:32
 * @since JDK 1.8
 */
@RequestMapping("/api/comment")
@RestController
@Api(description = "评论相关接口文档")
public class CommentController {
    @Autowired
    CommentService commentService;
}
