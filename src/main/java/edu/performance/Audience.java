package edu.performance;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
public class Audience {
    @Before("execution(* Performance.Perform(..))")
    public void takeSeat(){
        System.out.println("就座");
    }
    @Before("execution(* Performance.Perform(..))")
    public void silentPhone(){
        System.out.println("静音手机");
    }
    @AfterReturning("execution(* Performance.Perform(..))")
    public void Appluad(){
        System.out.println("好!啪啪啪");
    }
    @AfterThrowing("execution(* Performance.Perform(..))")
    public void Unhappy(){
        System.out.println("垃圾");
    }
}
