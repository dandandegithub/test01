package com.itcast.test;

import com.itcast.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test
    public void test01(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService service = (IAccountService) ac.getBean("accountService");
        service.findAll();
    }

}
