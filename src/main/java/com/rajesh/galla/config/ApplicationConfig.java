package com.rajesh.galla.config;

import com.rajesh.galla.ApplicationContextAwareTest;
import com.rajesh.galla.aspect.SampleAspect;
import com.rajesh.galla.entity.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring.xml")
public class ApplicationConfig {

    @Bean
    public Triangle triangle() {

        Triangle triangle = new Triangle();
        triangle.setPointA("pointA");
        triangle.setPointB("pointB");
        triangle.setPointC("pointC");
        return triangle;
    }

    @Bean
    public SampleAspect sampleAspect() {

        return new SampleAspect();
    }

    @Bean
    public ApplicationContextAwareTest applicationContextAwareTest() {

        return new ApplicationContextAwareTest();
    }
}
