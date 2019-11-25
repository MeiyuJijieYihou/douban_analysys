package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 角色-权限类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/23 19:33
 * @since JDK 1.8
 */
@ApiModel("用户-权限")
@Data
public class SysRolePermission {

    /**
     * 角色id
     */
    @ApiModelProperty("角色id")
    private String roleId;

    /**
     * 角色名
     */
    @ApiModelProperty("角色名")
    private String roleName;

    /**
     * 权限id
     */
    @ApiModelProperty("权限id")
    private String permissionId;

    /**
     * 权限url
     */
    @ApiModelProperty("权限url")
    private String url;
}
