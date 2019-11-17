package com.itcast.service.impl;

import com.itcast.dao.IAccountDao;
import com.itcast.domain.Account;
import com.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao iAccountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有");
        return iAccountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层：保存信息");
        iAccountDao.save(account);
    }
}
