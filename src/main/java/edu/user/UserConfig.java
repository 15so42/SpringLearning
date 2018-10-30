package edu.user;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class UserConfig {

    @Bean
    public UserServiceLogger logger(){
        return new UserServiceLogger();
    }
    @Bean
    public UserServiceImpl userServiceImpl(){
        return  new UserServiceImpl();}

    @Bean
    public UserDao dao(){
        return new UserDao();
    }



}
