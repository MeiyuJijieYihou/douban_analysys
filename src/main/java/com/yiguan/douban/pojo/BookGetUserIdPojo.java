package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: naipan
 * @date: 2019/11/22 12:36
 * @package_name: com.yiguan.douban.pojo
 * @project_name: douban_analysys
 * @description:
 */
@Data
public class BookGetUserIdPojo {

    /**
     * 评论用户id
     */
    @ApiModelProperty("评论用户id")
    private String userId;
}
