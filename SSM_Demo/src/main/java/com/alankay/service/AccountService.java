package com.alankay.service;
import com.alankay.domain.Account;
import java.util.List;

/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/2/14:20
 */
public interface AccountService {
    //查询所有账户
    public List<Account> FindAll();
    //保存账户信息
    public void saveAccount(Account account);
}
