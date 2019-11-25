package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

/**
 * @Author: naipan
 * @Date: 2019/11/14
 * @Class_name: User
 * @Qualified_ClassName:
 * @Description: ToDo
 */
@Data
@ApiModel("用户")
public class User {

  /**
   * 用户id
   */
  @Id
  @ApiModelProperty("用户id")
  private String id;

  /**
   * 用户名字
   */
  @ApiModelProperty("用户名name")
  private String name;

  /**
   * 用户头像地址
   */
  @ApiModelProperty("用户头像")
  private String head;

  /**
   * 用户性别
   */
  @ApiModelProperty("用户性别")
  private Boolean inferred_sex;
}
