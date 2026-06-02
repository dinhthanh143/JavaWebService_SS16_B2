package com.example.demo.b2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Aspect
@Component
@Slf4j
public class AuditLogAspect {
    @After("execution(* com.example.demo.b2.controller.*.*(..))")
    public void auditLog(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        log.info("[AUDIT LOG] Tài khoản '{}' đã gọi hàm '{}' vào lúc {}.", userName, methodName, java.time.LocalDateTime.now());
    }
}
