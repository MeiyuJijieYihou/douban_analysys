package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.List;

/**
 * Description: 角色类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/22 21:22
 * @since JDK 1.8
 */
@ApiModel("角色")
@Data
public class SysRole {

    /**
     * 角色id
     */
    @Id
    @ApiModelProperty("角色id")
    private Long id;

    /**
     * 角色名
     */
    @ApiModelProperty("角色名")
    private String name;

    /**
     * 角色权限
     */
    @ApiModelProperty("角色权限")
    private List<SysPermission> permissions;

}