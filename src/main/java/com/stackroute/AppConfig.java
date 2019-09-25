package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor() {
        return new Actor("Brad Pitt","Male",46);
    }
    @Bean(name = "movie")
    public Movie movie() {
        return new Movie();
    }
    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean() {
        return new BeanLifecycleDemoBean();
    }
}
