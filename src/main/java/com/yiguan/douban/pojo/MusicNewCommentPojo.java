package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: MusicNewCommentPojo
 * @Description: TODO(根据id得到最新的N条音乐评论，N由前端传入，默认为10)
 * @Author: 付晓
 * @Date: 2019/11/17 22:17
 */
@ApiModel("音乐最新评价pojo")
@Data
public class MusicNewCommentPojo {
    /**
     * 音乐封面路径
     */
    @ApiModelProperty("音乐封面路径")
    private String coverUrl;

    /**
     * 音乐名
     */
    @ApiModelProperty("音乐名")
    private String name;

    /**
     * 歌手名
     */
    @ApiModelProperty("歌手名")
    private String singer;

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
