package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoginAspect {

    // Reusing a pointcut expression that was declared before 
    // Works for all methods in a specific package located in any class with any parameter(s)
    @Before("com.example.aopdemo.aspect.MyAopExpressions.forDAOPackageNoGetterSetter()")
    public void beforeAnyMethodOfAPackage() {
	System.out.println("\n ***** This executes before calling any method of com.example.aopdemo.dao package with any return type and parameters");
    }

}

