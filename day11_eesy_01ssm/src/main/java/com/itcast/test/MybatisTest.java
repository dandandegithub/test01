package com.itcast.test;

import com.itcast.dao.IAccountDao;
import com.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = build.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);

        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

        //关闭
        session.close();
        inputStream.close();

    }
    @Test
    public void test2() throws Exception {

        Account account1 = new Account();
        account1.setMoney(320d);
        account1.setName("小美");

        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = build.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);

        dao.save(account1);

        session.commit();

        //关闭
        session.close();
        inputStream.close();

    }

}
