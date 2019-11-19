package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookController
 * @Description: TODO(该类用于返回 最火标签下评论数最多的10本书)
 * @Author: 付晓
 */
@ApiModel("书籍Pojo")
@Data
public class BookPojo {

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
     * 书的简介
     */
    @ApiModelProperty("书的简介")
    private String introduction;
}
