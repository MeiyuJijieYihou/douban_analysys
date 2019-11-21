package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 18460
 */
@Data
@ApiModel("数据库字段及注释")
public class MusicColumnCommentPojo {
    /**
     * 数据库字段名
     */
    @ApiModelProperty("数据库字段名")
    private String columnName;

    /**
     * 数据库字段名对应的注释
     */
    @ApiModelProperty("数据库字段名对应的注释")
    private String columnComment;
}
