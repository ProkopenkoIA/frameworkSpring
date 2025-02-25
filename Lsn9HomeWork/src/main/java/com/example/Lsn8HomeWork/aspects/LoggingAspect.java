package com.example.Lsn8HomeWork.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(TrackUserAction))", returning = "returnedValue")
    public void log(JoinPoint joinPoint, Object returnedValue) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().toString();
        Object[] methodArgs = joinPoint.getArgs();

        logger.info( "Информация логирования: ");
        logger.info(  "Вызванный метод: " + methodName);
        logger.info("Класс: " +  className);
        logger.info("Аргументы: " + Arrays.toString(methodArgs));
        logger.info("Метод отработал и вернул значение: " +  returnedValue);
        logger.info("Конец блока логирования. ");
    }

}
