package com.yiguan.douban.entity;

import lombok.Data;

import java.util.Date;

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
   * 音乐别名
   */
  private String otherName;

  /**
   * 歌手名
   */
  private String singer;

  /**
   *流派风格
   */
  private String style;

  /**
   *专辑类型
   */
  private String albumType;

  /**
   *介质
   */
  private String medium;

  /**
   *发行时间
   */
  private Date issueDate;

  /**
   *出版者
   */
  private String publisher;

  /**
   *唱片数
   */
  private Long songNumbers;

  /**
   *ISRC(中国)
   */
  private String ISRC;

  /**
   *条形码
   */
  private String barcode;

  /**
   *其他版本
   */
  private String otherVersion;

  /**
   *相关电影
   */
  private String relateMovies;

  /**
   *简介
   */
  private String introduction;

  /**
   *曲目
   */
  private String track;

  /**
   *评分
   */
  private Float reviewScore;

  /**
   *评分人数
   */
  private Long reviewNum;

}
