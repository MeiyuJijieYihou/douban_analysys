package com.yiguan.douban.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Book {

  /**
   * 书籍编号
   */
  private Long id;

  /**
   * 作者
   */
  private String author;

  /**
   * 书名
   */
  private String name;

  /**
   * 出版社
   */
  private String press;

  /**
   * 出品方
   */
  private String producers;

  /**
   * 副标题
   */
  private String subtitle;

  /**
   * 原作名
   */
  private String originalname;

  /**
   * 译者
   */
  private String translator;

  /**
   * 出版年
   */
  private Date year;

  /**
   * 页数
   */
  private Long pages;

  /**
   * 定价
   */
  private Long pricing;

  /**
   * 装帧
   */
  private String binding;

  /**
   * 丛书
   */
  private String series;

  /**
   * ISBN
   */
  private String isbn;

  /**
   * 封面
   */
  private String cover;

  /**
   * 标签
   */
  private String sort;

}
