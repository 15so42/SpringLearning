package edu.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
    public DataSource ds;
    Connection conn;
    Statement stmt=null;

    public Dao(DataSource ds) throws SQLException {
    this.ds=ds;

        }



    public ResultSet selectAll(){
        ResultSet rs=null;
        String sql="select * from emp";
        try {
            conn=ds.getConnection();
            stmt=  conn.createStatement();
            rs= stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void close(){
        try{


        if(conn!=null){
            conn.close();
        }
        if(stmt!=null)
            stmt.close();
        }catch (SQLException e){
            System.out.println("数据连接池关闭异常:"+e.getMessage());
        }

    }
}
