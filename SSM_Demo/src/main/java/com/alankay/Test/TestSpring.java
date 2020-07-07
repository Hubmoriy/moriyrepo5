package com.alankay.Test;

import com.alankay.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/218:38
 */
public class TestSpring {
    @Test
    public void demo1(){
        //配置文件加载
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        //方法调用
        AccountService accountService=applicationContext.getBean("accountservice",AccountService.class);
        accountService.FindAll();
    }
}
