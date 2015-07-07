package com.rajesh.galla;

import com.rajesh.galla.config.ApplicationConfig;
import com.rajesh.galla.entity.Triangle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest{

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationContextAwareTest test = context.getBean("applicationContextAwareTest", ApplicationContextAwareTest.class);

        Triangle triangle = test.getApplicationContext().getBean("triangle", Triangle.class);

        System.out.println(triangle);

    }
}