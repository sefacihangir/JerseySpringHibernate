package com.rajesh.galla;

import com.rajesh.galla.config.ApplicationConfig;
import com.rajesh.galla.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Triangle triangle = context.getBean("triangle",Triangle.class);
        System.out.println("Point A is " + triangle.getPointA());
    }
}
