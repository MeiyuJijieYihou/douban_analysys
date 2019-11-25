package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: 乃攀
 * @Date: 2019/11/5 16:44
 * @Description:
 */
public interface UserMapper extends Mapper<User> {


    List<User> selectUsers();

    void setIsFemale(String id);

    void setIsMale(String id);
}
