package com.custom.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Aspect
@Component
@sl4
public class LoggingAspect {

    @Around("@annotation(com.custom.annotations.LogExecution)")
    public Object logMethodExecution(ProceedingJoinPoint joinPoint, LogExecution logExecution) throws Throwable{

        Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());

        String methodName = joinPoint.getSignature().toShortString();

        if(logExecution.logArgs()){
            log.info("{} args{}",methodName, Arrays.toString(joinPoint.getArgs()));
        }
        
        long start = System.currentTimeMillis();

           try {
            Object result = joinPoint.proceed();

            if (logExecution.logTime()) {
                log.info("{} took {} ms",
                        methodName,
                        System.currentTimeMillis() - start);
            }
            return result;

        } catch (Exception ex) {
            log.error("Exception in {}", methodName, ex);
            throw ex;
        }

    }

}
