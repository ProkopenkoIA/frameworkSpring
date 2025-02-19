package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.model.Comment;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example.services.*.*(..))")
    @Order(1)
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        /**
         * Показывает списко доступных методов
         */
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();

        System.out.println("Method " + methodName+
                " with parameters " + Arrays.asList(arguments)+
                " will execute");

        System.out.println("Метод будет выполнен");
        //logger.info("Метод будет выполнен");
        /**
         * Перехватывает параметры и производит их замену
         */
        Comment comment = new Comment();
        comment.setText("DEMO123456");
        comment.setAuthor("AUTHOR12");
        Object [] newArguments = {comment};


        Object returnedByMthod = joinPoint.proceed(newArguments);
        //logger.info("Метод выполнен");
        System.out.println("Метод выполнен");
        return returnedByMthod;
    }


    @Around("execution(* org.example.services.*.*(..))")
    @Order(2)
    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Метод: "+joinPoint.getSignature().getName() + " - "+elapsedTime+" млс");
        return result;
    }

    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
    public void log(Object returnedValue) {
        logger.info("Метод выполнен и возвратил " + returnedValue);
    }
}
