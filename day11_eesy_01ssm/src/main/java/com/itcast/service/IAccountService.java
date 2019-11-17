package com.itcast.service;

import com.itcast.domain.Account;

import java.util.List;

public interface IAccountService {

    //查询所有
    public List<Account> findAll();

    //保存账户
    void save(Account account);

}
