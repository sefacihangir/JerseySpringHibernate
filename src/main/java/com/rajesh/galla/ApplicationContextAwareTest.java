package com.rajesh.galla;

import com.rajesh.galla.entity.Triangle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareTest  implements ApplicationContextAware{

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }

    @Override
    public String toString() {

        Triangle triangle = applicationContext.getBean("triangle", Triangle.class);
        return triangle.toString();
    }

}
