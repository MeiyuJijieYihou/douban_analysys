package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class User {

  /**
   * 用户id
   */
  private Long id;

  /**
   * 用户名字
   */
  private String name;

  /**
   * 用户头像地址
   */
  private String head;

}
