package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class Comment {

  private long id;
  private long type;
  private long subtype;
  private String pname;
  private long seen;
  private long star;
  private java.sql.Timestamp date;
  private String title;
  private String content;
  private long usefulNumber;
  private long uselessNumber;
  private long targetId;

}
