package com.yiguan.douban.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 18460
 */

@Data
public class Top5CommentMusicPojo {

    /**
     * 音乐别名
     */
    private String name;

    /**
     * 歌手名
     */
    private String singer;

    /**
     * 流派风格
     */
    private String style;

    /**
     * 发行时间
     */
    private Date issueDate;

    /**
     * 评论数目
     */
    private Integer commentNumber;
}
