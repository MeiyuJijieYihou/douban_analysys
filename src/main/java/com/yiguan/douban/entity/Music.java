package com.yiguan.douban.entity;


public class Music {

  private long id;
  private String coverUrl;
  private String name;
  private String singer;
  private long playTimes;
  private long status;
  private long listDays;
  private String style;
  private java.sql.Date issueDate;
  private String publisher;
  private long songNumbers;
  private String barcode;
  private String introduction;
  private String track;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCoverUrl() {
    return coverUrl;
  }

  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSinger() {
    return singer;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }


  public long getPlayTimes() {
    return playTimes;
  }

  public void setPlayTimes(long playTimes) {
    this.playTimes = playTimes;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getListDays() {
    return listDays;
  }

  public void setListDays(long listDays) {
    this.listDays = listDays;
  }


  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }


  public java.sql.Date getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(java.sql.Date issueDate) {
    this.issueDate = issueDate;
  }


  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public long getSongNumbers() {
    return songNumbers;
  }

  public void setSongNumbers(long songNumbers) {
    this.songNumbers = songNumbers;
  }


  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
  }

}
