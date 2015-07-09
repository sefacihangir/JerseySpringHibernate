package com.rajesh.galla.config;

import com.rajesh.galla.ApplicationContextAwareTest;
import com.rajesh.galla.aspect.SampleAspect;
import com.rajesh.galla.bo.UserDetailsBO;
import com.rajesh.galla.entity.Triangle;
import com.rajesh.galla.resource.UserResource;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring.xml")
public class ApplicationConfig {

    public ApplicationConfig() {
    }

//    @Bean
//    public Triangle triangle() {
//
//        Triangle triangle = new Triangle();
//        triangle.setPointA("pointA");
//        triangle.setPointB("pointB");
//        triangle.setPointC("pointC");
//        return triangle;
//    }
//
//    @Bean
//    public SampleAspect sampleAspect() {
//
//        return new SampleAspect();
//    }
//
//    @Bean
//    public ApplicationContextAwareTest applicationContextAwareTest() {
//
//        return new ApplicationContextAwareTest();
//    }
//
//    @Required
//    @Bean
//    UserDetailsBO userDetailsBO() {
//
//        return new UserDetailsBO();
//    }
//
//    @Bean
//    UserResource userResource() {
//
//        UserResource userResource = new UserResource();
//        userResource.setUserDetailsBO(userDetailsBO());
//        return userResource;
//    }
}
