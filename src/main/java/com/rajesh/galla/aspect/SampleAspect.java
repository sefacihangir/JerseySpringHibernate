package com.rajesh.galla.aspect;

import com.rajesh.galla.entity.Triangle;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class SampleAspect {

    @Before("execution(public String getPointA())")
    public void beforeAdvice() {

        System.out.println("Before Advice");
    }

}
