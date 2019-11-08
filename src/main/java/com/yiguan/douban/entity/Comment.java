package com.yiguan.douban.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {

  /**
   * 评论编号
   */
  private Long id;

  /**
   * 类型（电影、书籍、音乐）
   */
  private Long type;

  /**
   * 副类型（短评/长评）
   */
  private Long subtype;

  /**
   * 评论者姓名
   */
  private String pname;

  /**
   * 是否看过（电影短评细分，其他无)
   */
  private Long seen;

  /**
   * 评价（星）
   */
  private Long star;

  /**
   * 评论日期
   */
  private Date date;

  /**
   * 标题（非短评）
   */
  private String title;

  /**
   * 内容
   */
  private String content;

  /**
   * 有用数量
   */
  private Long usefulNumber;

  /**
   * 没用数量（非短评）
   */
  private Long uselessNumber;

  /**
   * 目标id（电影id、书籍id、音乐id）
   */
  private Long targetId;

}
