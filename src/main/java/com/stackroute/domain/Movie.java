package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    @Autowired
    @Qualifier("a")
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display()
    {
        System.out.println("Name: " + actor.getName());
        System.out.println("Age: " + actor.getAge());
        System.out.println("Gender: " + actor.getGender());
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory is" + beanFactory);
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName is " + s);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext: " + applicationContext);
    }
}
