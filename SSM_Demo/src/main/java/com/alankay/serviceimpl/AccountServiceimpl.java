package com.alankay.serviceimpl;

import com.alankay.dao.AccountDao;
import com.alankay.domain.Account;
import com.alankay.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/214:21
 */
@Service("accountservice")
public class AccountServiceimpl  implements AccountService{
    @Autowired
    private AccountDao accountdao;
    public List<Account> FindAll() {
        System.out.println("测试文本：查询全部用户执行");
        return accountdao.FindAll();
    }


    public void saveAccount(Account account) {
        System.out.println("测试文本：添加用户执行");
        accountdao.saveAccount(account);

    }
}
