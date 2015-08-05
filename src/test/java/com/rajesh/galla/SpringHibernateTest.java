package com.rajesh.galla;

import com.rajesh.galla.bo.TriangleBOImplementation;
import com.rajesh.galla.config.ApplicationConfig;
import com.rajesh.galla.entity.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHibernateTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TriangleBOImplementation triangleBOImplementation = context.getBean("triangleBO", TriangleBOImplementation.class);

        Triangle triangle = context.getBean("triangle", Triangle.class);

        triangleBOImplementation.save(triangle);
    }
}