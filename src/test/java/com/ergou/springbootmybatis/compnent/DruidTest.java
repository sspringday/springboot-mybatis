package com.ergou.springbootmybatis.compnent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 22:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidTest {

    @Autowired
    DataSource dataSource;

     @Test
    public  void test() throws Exception{
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
