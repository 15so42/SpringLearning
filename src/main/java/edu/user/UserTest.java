package edu.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
        UserServiceImpl userServiceImpl= (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.setDao((UserDao) context.getBean("dao"));
        userServiceImpl.AddNewUser();
    }
}
