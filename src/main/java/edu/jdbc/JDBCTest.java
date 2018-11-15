package edu.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {

    public static  void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbcContext.xml");
        Dao dao=(Dao) ctx.getBean("dao");
        ResultSet rs=dao.selectAll();
        try {
            while (rs.next()) {
                System.out.println(rs.getString(1)+",  "+rs.getString(2));
            }
        }catch (SQLException e){
            //ignore
        }
        finally {
            dao.close();
        }
    }
}
