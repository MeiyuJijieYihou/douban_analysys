package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

/**
 * Description: 权限类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/23 19:30
 * @since JDK 1.8
 */
@ApiModel("电影")
@Data
public class SysPermission {

    /**
     * 权限id
     */
    @Id
    @ApiModelProperty("权限id")
    private Long id;

    /**
     * 权限名称
     */
    @ApiModelProperty("权限id")
    private String name;

    /**
     * 权限url
     */
    @ApiModelProperty("权限url")
    private String url;

    /**
     * 权限描述
     */
    @ApiModelProperty("权限描述")
    private String description;
}
