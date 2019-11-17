package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description：(该类用于返回 根据id查询到的书籍的最新10条评论)
 * @author: chenfl
 * @Date: 2019/11/17 20:39
 */
@Data
public class BookNewCommentPojo {

    /**
     * 书的封面
     */
    @ApiModelProperty("书的封面")
    private String cover;

    /**
     * 书名
     */
    @ApiModelProperty("书名")
    private String name;

    /**
     * 书的作者
     */
    @ApiModelProperty("书的作者")
    private String author;

    /**
     * 评论内容
     */
    @ApiModelProperty("评论内容")
    private String content;

    /**
     * 评论日期
     */
    @ApiModelProperty("评论日期")
    private Date date;
}
