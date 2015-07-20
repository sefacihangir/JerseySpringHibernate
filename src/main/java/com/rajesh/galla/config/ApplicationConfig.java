package com.rajesh.galla.config;

import com.rajesh.galla.aspect.SampleAspect;
import com.rajesh.galla.bo.UserDetailsBO;
import com.rajesh.galla.dao.UserDetailsDAO;
import com.rajesh.galla.entity.Triangle;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy
@Configuration
@EnableTransactionManagement
@ImportResource("classpath:applicationContext.xml")
public class ApplicationConfig {

    @Autowired
    private SessionFactory sessionFactory;

    public ApplicationConfig() {
    }

    @Bean
    public Triangle triangle() {

        System.out.println("Accessing triangle bean");
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

//    @Bean
//    public UserDetailsDAO userDetailsDAO() {
//
//        UserDetailsDAO userDetailsDAO = new UserDetailsDAO();
//        userDetailsDAO.setSessionFactory(sessionFactory);
//        return userDetailsDAO;
//    }
//
//    @Bean
//    public UserDetailsBO userDetailsBO() {
//
//        UserDetailsBO userDetailsBO = new UserDetailsBO();
//        userDetailsBO.setUserDetailsDAO(userDetailsDAO());
//        return userDetailsBO;
//    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
