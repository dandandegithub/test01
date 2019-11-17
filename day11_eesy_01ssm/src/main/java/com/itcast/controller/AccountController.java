package com.itcast.controller;

import com.itcast.domain.Account;
import com.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 表现层
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService service;

    @RequestMapping("testFindAll")
    public String findAll(Model model){

        System.out.println("表现层：执行findAll方法");
        List<Account> list = service.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("testSave")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("表现层：执行save方法");
        service.save(account);
        request.getRequestDispatcher("/account/testFindAll").forward(request,response);
    }

}
