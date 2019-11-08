package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Region {

  /**
   *地址id
   */
  @Id
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
