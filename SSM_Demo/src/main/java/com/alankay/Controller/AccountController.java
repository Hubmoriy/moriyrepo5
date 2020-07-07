package com.alankay.Controller;

import com.alankay.domain.Account;
import com.alankay.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/2/14:24
 */
@Controller
@RequestMapping("/mvc")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/demo1")
    public String  AccountControllerDemo1(){
        return "success";
    }
    @RequestMapping("/find")
    public String FindAll(Model model){
        //调用Service方法
        System.out.println("表现层查询客户");
        List<Account> list = accountService.FindAll();
        model.addAttribute("list",list);

        return "success";
    }
    @RequestMapping("/save")
    public void Save(Account account,HttpServletResponse response,HttpServletRequest request) throws Exception{
        //调用Service方法
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/mvc/find");
        return;
    }

}
