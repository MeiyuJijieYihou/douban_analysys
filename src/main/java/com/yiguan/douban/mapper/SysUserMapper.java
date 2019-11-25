package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.SysPermission;
import com.yiguan.douban.entity.SysRole;
import com.yiguan.douban.entity.SysRolePermission;
import com.yiguan.douban.entity.SysUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Description: 用户表Mapper
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/22 21:51
 * @since JDK 1.8
 */
public interface SysUserMapper extends Mapper<SysUser> {

    /**
     * description: 通过username查找 user
     *
     * @params [username]
     * @return com.yiguan.douban.entity.SysUser
     * @author LiBingxiang
     * @date 2019/11/23 19:54
     */
    SysUser findUserByUsername(String username);

    /**
     * description: 通过用户名 查找角色
     *
     * @params [username]
     * @return List<SysRole>
     * @author LiBingxiang
     * @date 2019/11/23 19:55
     */
    List<SysRole> findRolesByUsername(String username);

    /**
     * description: 通过用户名 查找权限
     *
     * @params [username]
     * @return java.util.List<SysPermission>
     * @author LiBingxiang
     * @date 2019/11/23 19:56
     */
    List<SysPermission> findPermissionsByUsername(String username);

    /**
     * description: 查找全部角色-权限
     *
     * @params []
     * @return java.util.List<com.yiguan.douban.entity.SysRolePermisson>
     * @author LiBingxiang
     * @date 2019/11/23 19:56
     */
    List<SysRolePermission> findAllRolePermission();
}
