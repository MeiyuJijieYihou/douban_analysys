package com.yiguan.douban.entity;

import lombok.Data;

/**
 * Description: 角色-权限类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/23 19:33
 * @since JDK 1.8
 */
@Data
public class SysRolePermission {

    /**
     * 角色
     */
    private String roleId;
    private String roleName;

    /**
     * 权限
     */
    private String permissionId;
    private String url;
}
