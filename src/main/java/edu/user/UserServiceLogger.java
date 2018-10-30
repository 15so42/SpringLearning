package edu.user;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class UserServiceLogger {
    //private static final Logger log=;
    @Before("execution(* UserServiceImpl.AddNewUser(..))")
    public void before(JoinPoint jp){
        System.out.println("开始前");
    }
    @AfterReturning("execution(* UserServiceImpl.AddNewUser(..))")
    public void AfterReturning(){
        System.out.println("添加成功");
    }
    @AfterThrowing("execution(* UserServiceImpl.AddNewUser(..))")
    public void AfterThrowing(){
        System.out.println("添加失败");
    }
}
