package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("书籍标签类")
@Data
public class Tag {

  /**
   * 标签tid
   */
  @ApiModelProperty("标签tid")
  private Long tid;

  /**
   * 书籍标签
   */
  @ApiModelProperty("书籍标签")
  private String sort;

  /**
   * 某具体书籍标签的总评人数
   */
  @ApiModelProperty("某具体书籍标签的总评人数")
  private long number;

  /**
   * 某具体书籍标签女性的总评人数
   */
  @ApiModelProperty("某具体书籍标签女性的总评人数")
  private long femaleNumber;
}
