package com.rajesh.galla.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {

    @Before("execution(public String getPointA())")
    public void beforeAdvice() {

        System.out.println("Before Advice");
    }
}
