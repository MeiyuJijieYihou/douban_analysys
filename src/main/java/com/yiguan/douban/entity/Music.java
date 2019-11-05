package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class Music {

  /**
   * 音乐id
   */
  private Long id;

  /**
   * 音乐封面路径
   */
  private String coverUrl;

  /**
   * 音乐名
   */
  private String name;

  /**
   * 歌手名
   */
  private String singer;

  /**
   * 播放次数
   */
  private Long playTimes;

  /**
   * 状态 2:排名上升  1：排名下降  0：排名不变
   */
  private Long status;

  /**
   * 上榜天数
   */
  private Long listDays;

  /**
   *流派风格
   */
  private String style;

  /**
   *发行时间
   */
  private java.sql.Date issueDate;

  /**
   *出版者
   */
  private String publisher;

  /**
   *唱片数
   */
  private Long songNumbers;

  /**
   *条形码
   */
  private String barcode;

  /**
   *简介
   */
  private String introduction;

  /**
   *曲目
   */
  private String track;

}
