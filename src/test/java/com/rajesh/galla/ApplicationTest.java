package com.rajesh.galla;

import com.rajesh.galla.bo.TriangleBO;
import com.rajesh.galla.config.ApplicationConfig;
import com.rajesh.galla.entity.Triangle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest{

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TriangleBO triangleBO = context.getBean("triangleBO",TriangleBO.class);

        Triangle triangle = new Triangle();
        triangle.setPointA("Point A");
        triangle.setPointB("Point B");
        triangle.setPointC("Point C");

        triangleBO.save(triangle);
    }
}