package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Book {

  /**
   * 书籍id
   */
  @Id
  private Long id;

  /**
   * 书名
   */
  private String name;

  /**
   * 书的作者
   */
  private String author;

  /**
   * 书出版社
   */
  private String press;

  /**
   * 书的出品方(投资方)
   */
  private String producers;

  /**
   * 书的副标题
   */
  private String subtitle;

  /**
   * 书的原作名
   */
  private String originalname;

  /**
   * 书的译者
   */
  private String translator;

  /**
   * 书的出版年
   */
  private String year;

  /**
   * 书的页数
   */
  private long pages;

  /**
   * 书的定价
   */
  private float pricing;

  /**
   * 书的装帧
   */
  private String binding;

  /**
   * 书的丛书系列
   */
  private String series;

  /**
   * 书的isbn
   */
  private String isbn;

  /**
   * 书的封面
   */
  private String cover;

  /**
   * 书的标签
   */
  private String sort;

  /**
   * 书的评分
   */
  private Double grade;

  /**
   * 书的评价人数
   */
  private Long number;

}
