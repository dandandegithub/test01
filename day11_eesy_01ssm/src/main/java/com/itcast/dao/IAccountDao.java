package com.itcast.dao;

import com.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层
 */
@Repository
public interface IAccountDao {

    //查询所有
    @Select(value="select * from account")
    List<Account> findAll();

    //保存账户
    @Insert(value = "insert into account (name,money) values (#{name},#{money})")
    void save(Account account);


}
