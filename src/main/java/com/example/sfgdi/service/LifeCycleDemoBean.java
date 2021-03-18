package com.example.sfgdi.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I`m in the LifeCycleDemoBean Constructor.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The BeanFactory has been set.");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My BeanName is: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleDemoBean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleDemoBean has its properties set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## The ApplicationContext has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The PostConstruct annotated method has been called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The PreDestroy annotated method has been called.");
    }

    public void beforeInit() {
        System.out.println("## BeforeInit - called by BeanPostProcessor.");
    }

    public void afterInit() {
        System.out.println("## AfterInit - called by BeanPostProcessor.");
    }
}
