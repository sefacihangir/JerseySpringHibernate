package com.rajesh.galla.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ImportResource("classpath:applicationContext.xml")
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
