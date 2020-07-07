package com.alankay.OraclTest;

import oracle.jdbc.driver.OracleTypes;
import org.junit.Test;

import java.sql.*;

/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/711:48
 */
public class OraclDemo {
    @Test
    public  void demo1() throws ClassNotFoundException, SQLException {
        //加载数据库驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获取连接
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.60:1521:orcl","moriy","dove8387");
        //获取预编译Statement对象
        PreparedStatement preparedStatement= connection.prepareStatement("select * from  emp where empno= ?;");
        preparedStatement.setObject(1,7788);
        //执行查询操作
        ResultSet resultSet= preparedStatement.executeQuery();
        //输出结果
        while(resultSet.next()){
            System.out.println(resultSet.getString("ename"));
        }
        //资源释放
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
    /**
     * java调用存储过程
     * {?= call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储函数使用
     *  {call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储过程使用
     * @throws Exception
     */
    @Test
    public  void demo2() throws ClassNotFoundException, SQLException {
        //加载数据库驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //得到Connection连接
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.60:1521:orcl",
                "moriy", "dve87");
        //得到预编译的Statement对象
        CallableStatement pstm = connection.prepareCall("{call p_yearsal(?, ?)}");
        //给参数赋值
        pstm.setObject(1, 7788);
        pstm.registerOutParameter(2, OracleTypes.NUMBER);
        //执行数据库查询操作
        pstm.execute();
        //输出结果[第二个参数]
        System.out.println(pstm.getObject(2));
        //释放资源
        pstm.close();
        connection.close();
    }
    /**
     * java调用存储函数
     * {?= call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储函数使用
     *  {call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储过程使用
     * @throws Exception
     */
    public  void demo3() throws ClassNotFoundException, SQLException{
        //加载数据库驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //得到Connection连接
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.88.6:1521:orcl",
                "moriy", "dove8387");
        //得到预编译的Statement对象
        CallableStatement pstm = connection.prepareCall("{?= call f_yearsal(?)}");
        //给参数赋值
        pstm.setObject(2, 7788);
        pstm.registerOutParameter(1, OracleTypes.NUMBER);
        //执行数据库查询操作
        pstm.execute();
        //输出结果[第一个参数]
        System.out.println(pstm.getObject(1));
        //释放资源
        pstm.close();
        connection.close();
    }
}
