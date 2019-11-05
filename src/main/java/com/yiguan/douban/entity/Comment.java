package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class Comment {

  private Long id;
  private Long type;
  private Long subtype;
  private String pname;
  private Long seen;
  private Long star;
  private java.sql.Timestamp date;
  private String title;
  private String content;
  private Long usefulNumber;
  private Long uselessNumber;
  private Long targetId;

}
