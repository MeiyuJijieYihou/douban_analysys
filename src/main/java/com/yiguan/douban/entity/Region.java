package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

/**
 * @Author: naipan
 * @Date: 2019/11/14
 * @Class_name: Region
 * @Qualified_ClassName:
 * @Description: ToDo
 */

@Data
@ApiModel("地址")
public class Region {

  /**
   *地址id
   */
  @Id
  @ApiModelProperty("地址id")
  private Long id;

  /**
   * 地址名字
   */
  @ApiModelProperty("地址名字")
  private String name;

  /**
   * 父地址id
   */
  @ApiModelProperty("父地址id")
  private Long parentId;



}
