package edu.performance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PerformanceTest {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(PerformanceConfig.class);
        Performance performance= (Performance) context.getBean("opera");
        performance.Perform();
    }
}
