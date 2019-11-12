package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Movie {

  /**
   * 电影编号
   */
  @Id
  private Long id;

  /**
   * 电影名称
   */
  private String name;

  /**
   * 导演
   */
  private String director;

  /**
   * 编剧
   */
  private String screenwriter;

  /**
   * 主演
   */
  private String starring;

  /**
   * 类型
   */
  private String type;

  /**
   * 语言
   */
  private String language;

  /**
   * 上映日期
   */
  private String date;

  /**
   * 片长
   */
  private Long length;

  /**
   * 又名
   */
  private String otherName;

  /**
   * IMDb
   */
  private String imDb;

  /**
   * 短评数量
   */
  private Long shortCommentNumber;

  /**
   * 影评数量
   */
  private Long commentNumber;

  /**
   * 豆瓣评分
   */
  private Double score;

  /**
   * 评分人数
   */
  private Integer scoreNumber;

}
