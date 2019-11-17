package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
//    @Select("select * from user")
    List<User> findAll();
}
