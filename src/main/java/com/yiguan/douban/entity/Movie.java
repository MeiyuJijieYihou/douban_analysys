package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

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
   * 制片国家/地区
   */
  @Transient
  private String countriesRegions;

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


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getScreenwriter() {
    return screenwriter;
  }

  public void setScreenwriter(String screenwriter) {
    this.screenwriter = screenwriter;
  }

  public String getStarring() {
    return starring;
  }

  public void setStarring(String starring) {
    this.starring = starring;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCountriesRegions() {
    return countriesRegions;
  }

  public void setCountriesRegions(String countriesRegions) {
    this.countriesRegions = countriesRegions;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public String getOtherName() {
    return otherName;
  }

  public void setOtherName(String otherName) {
    this.otherName = otherName;
  }

  public String getImDb() {
    return imDb;
  }

  public void setImDb(String imDb) {
    this.imDb = imDb;
  }

  public Long getShortCommentNumber() {
    return shortCommentNumber;
  }

  public void setShortCommentNumber(Long shortCommentNumber) {
    this.shortCommentNumber = shortCommentNumber;
  }

  public Long getCommentNumber() {
    return commentNumber;
  }

  public void setCommentNumber(Long commentNumber) {
    this.commentNumber = commentNumber;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getScoreNumber() {
    return scoreNumber;
  }

  public void setScoreNumber(Integer scoreNumber) {
    this.scoreNumber = scoreNumber;
  }
}
