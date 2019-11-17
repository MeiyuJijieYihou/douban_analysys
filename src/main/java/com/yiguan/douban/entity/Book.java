package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

/**
 * @author
 */
@Data
@ApiModel("书籍")
public class Book {

  /**
   * 书籍id
   */
  @Id
  @ApiModelProperty("书籍id")
  private Long id;

  /**
   * 书名
   */
  @ApiModelProperty("书名")
  private String name;

  /**
   * 书的作者
   */
  @ApiModelProperty("书的作者")
  private String author;

  /**
   * 书出版社
   */
  @ApiModelProperty("书出版社")
  private String press;

  /**
   * 书的出品方(投资方)
   */
  @ApiModelProperty("书的出品方(投资方)")
  private String producers;

  /**
   * 书的副标题
   */
  @ApiModelProperty("书的副标题")
  private String subtitle;

  /**
   * 书的原作名
   */
  @ApiModelProperty("书的原作名")
  private String originalName;

  /**
   * 书的译者
   */
  @ApiModelProperty("书的译者")
  private String translator;

  /**
   * 书的出版年
   */
  @ApiModelProperty("书的出版年")
  private String year;

  /**
   * 书的页数
   */
  @ApiModelProperty("书的页数")
  private Long pages;

  /**
   * 书的定价
   */
  @ApiModelProperty("书的定价")
  private Double pricing;

  /**
   * 书的装帧
   */
  @ApiModelProperty("书的装帧")
  private String binding;

  /**
   * 书的丛书系列
   */
  @ApiModelProperty("书的丛书系列")
  private String series;

  /**
   * 书的isbn
   */
  @ApiModelProperty("书的isbn")
  private String isbn;

  /**
   * 书的封面
   */
  @ApiModelProperty("书的封面")
  private String cover;

  /**
   * 书的标签
   */
  @ApiModelProperty("书的标签")
  private String sort;

  /**
   * 书的评分
   */
  @ApiModelProperty("书的评分")
  private Double grade;

  /**
   * 书的评价人数
   */
  @ApiModelProperty("书的评价人数")
  private Long number;

  /**
   * 书的简介
   */
  @ApiModelProperty("书的评价人数")
  private String introduction;

}
