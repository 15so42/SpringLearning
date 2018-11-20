package edu.batis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args){
        String resource="batis.xml";
        InputStream iStream=Test.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(iStream);
        SqlSession session=sessionFactory.openSession(true);
        try{
            GetEmpInfo empInfoMapper=session.getMapper(GetEmpInfo.class);
            Emp emp=new Emp(12,"xix","啊啊啊");

            Emp rs=empInfoMapper.GetEmp(emp.getEmpNo());
            System.out.println("ResultType:");
            System.out.println("员工号:"+rs.getEmpNo()+"员工姓名"+rs.geteName());

            System.out.println("ResultMap:");
            Emp rs1=empInfoMapper.GetEmpByResultMap(emp.getEmpNo());
            System.out.println("员工号:"+rs1.getEmpNo()+"员工姓名"+rs1.geteName());

            System.out.println("----------------User-----------------");
            UserOp userOp=session.getMapper(UserOp.class);
            User user=userOp.getUser(001);
            System.out.println(user.toString());


        }catch (Exception e){
            System.out.println("batis测试出现异常:"+e.getMessage());
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
