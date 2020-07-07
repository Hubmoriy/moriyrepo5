package com.alankay.dao;

import com.alankay.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description(描述):持久层接口
 * author（作者）：河流
 * time：2020/7/2/14:16
 */
@Repository
public interface AccountDao {
    //查询所有账户
    @Select("select * from account")
    public List<Account> FindAll();
    //保存账户信息
    @Insert("insert into account (name,moeny) values (#{name},#{moeny})")
    public void saveAccount(Account account);

}
