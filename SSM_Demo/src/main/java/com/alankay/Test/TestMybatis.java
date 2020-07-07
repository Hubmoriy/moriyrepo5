package com.alankay.Test;


import com.alankay.dao.AccountDao;
import com.alankay.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/2/18:39
 */
public class TestMybatis {
    @Test
    public void demo()throws  Exception{
        //加载配置文件：（获取流）
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        // 查询所有数据
        List<Account> list = accountDao.FindAll();
        for(Account account : list){
            System.out.println(account);
        }
        accountDao.FindAll();
        // 关闭资源
        session.close();
        resourceAsStream.close();

    }
    //测试保存
    @Test
    public void demo2()throws Exception{

        Account account = new Account();
        account.setName("熊大");
        account.setMoeny(400d);
        //加载配置文件：（获取流）
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        //  模拟数据
        accountDao.saveAccount(account);
        //提交事务
        session.commit();


    }
}
