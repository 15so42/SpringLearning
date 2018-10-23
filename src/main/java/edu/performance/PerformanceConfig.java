package edu.performance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class PerformanceConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }
    @Bean(name="ballet")
    public Performance PerformanceBallet(){
        return new Ballet();
    }
    @Bean(name="opera")
    public Performance PerformanceOpera(){
        return new Opera();
    }
}
