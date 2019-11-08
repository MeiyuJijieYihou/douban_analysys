package com.yiguan.douban.mybatis.po;

import com.yiguan.douban.entity.User;

/**
 * @auther: naipan
 * @date: 2019/11/8 19:51
 * @package_name: com.yiguan.douban.mybatis.po
 * @project_name: douban
 * @description:
 */
public class UserQueryVo {

    private User user;

    private int[] ids;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;

    }
}