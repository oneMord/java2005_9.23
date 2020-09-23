package com.qf.dao;

import org.junit.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {

//    @Before
//    public void init(){
//        System.out.println("准备环境...");
//    }

    @BeforeClass
    public static void init(){
        System.out.println("准备环境...");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }


//    @After
//    public void destory(){
//        System.out.println("结束环境...");
//    }

    @AfterClass
    public static void destory(){
        System.out.println("结束环境...");
    }

    @Test
    public void testMysql()throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///3306/mydb");
        System.out.println(connection);
    }

}
