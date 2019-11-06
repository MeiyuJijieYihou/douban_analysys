package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class Region {

  /**
   *地址id
   */
  private Long id;

  /**
   * 地址名字
   */
  private String name;

  /**
   * 父地址id
   */
  private Long parentId;



}
