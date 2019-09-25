package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @PostConstruct
    public void customInit()
    {
        System.out.println("Method customInit() invoked");
    }

    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initialised");
    }
}
