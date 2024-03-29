package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用于包装评论榜前N的音乐
 * @author duan
 */

@Data
@ApiModel("评论音乐")
public class SimpleMusicPojo {

    /**
     * 音乐别名
     */
    @ApiModelProperty("音乐别名")
    private String name;

    /**
     * 歌手名
     */
    @ApiModelProperty("歌手名")
    private String singer;

    /**
     * 流派风格
     */
    @ApiModelProperty("流派风格")
    private String style;

    /**
     * 发行时间
     */
    @ApiModelProperty("发行时间")
    private Date issueDate;

    /**
     * 评论数目
     */
    @ApiModelProperty("评论数目")
    private Integer reviewNum;

}
