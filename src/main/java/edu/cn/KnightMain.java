package edu.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static  void main(String[]  args){
        ApplicationContext context=new ClassPathXmlApplicationContext("knight.xml");
        BraveKnight knight=(BraveKnight) context.getBean("braveKnight");
        knight.embarkquest();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
