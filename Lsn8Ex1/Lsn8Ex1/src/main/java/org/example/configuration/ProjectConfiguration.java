package org.example.configuration;


import org.example.aspects.LoggingAspect;
import org.example.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "org.example.services")
@EnableAspectJAutoProxy
public class ProjectConfiguration {

   /* @Bean
    public CommentService commentService() {
        return new CommentService();
    }*/

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}



