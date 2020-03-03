package com.javaniuniu.transactional.transaction;

import com.javaniuniu.transactional.annotation.AopTransaction;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;

import java.lang.reflect.Method;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/28 7:07 PM
 */
@Aspect
@Component
public class AopTransactionService {
    @Autowired
    private TransactionUtil transactionUtil;

    //当前事务
    private TransactionStatus transactionStatus;

    /**
     * 定义切入点，切入点为com.example.aop下的所有函数
     */
    @Pointcut("execution(public * com.javaniuniu.transactional.service..*.*(..))")
    public void transactionPoint() {
    }

    /**
     * 环绕通知 在方法调用之前和调用之后处理事情
     *
     * @param joinPoint 切入点
     */
    @Around("transactionPoint()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 1.获取方法的注解
        AopTransaction annotation = this.getMethodAopAnnotation(joinPoint);
        // 2.判断是否需要开启事务
        transactionStatus = begin(annotation);
        // 3.调用目标代理对象方法
        Object obj = joinPoint.proceed();
        // 4.判断关闭事务
        commit(transactionStatus);
        return obj;
    }

    /**
     * 异常通知进行 回滚事务
     */
    @AfterThrowing("transactionPoint()")
    public void afterThrowing() {
        rollback(transactionStatus);
    }

    /**
     * 获取代理方法上的事务注解
     *
     * @param joinPoint 切入点
     */
    private AopTransaction getMethodAopAnnotation(ProceedingJoinPoint joinPoint) throws Exception {
        //1. 获取代理对对象的方法
        String methodName = joinPoint.getSignature().getName();
        //2. 获取目标对象
        Class<?> classTarget = joinPoint.getTarget().getClass();
        //3. 获取目标对象类型
        Class<?>[] par = ((MethodSignature) joinPoint.getSignature()).getParameterTypes();
        //4. 获取目标对象方法
        Method objMethod = classTarget.getMethod(methodName, par);
        //5. 获取该方法上的事务注解
        return objMethod.getDeclaredAnnotation(AopTransaction.class);
    }

    /**
     * 开启事务
     */
    private TransactionStatus begin(AopTransaction annotation) {
        if (annotation == null) return null;
        return transactionUtil.begin();
    }

    /**
     * 回滚事务
     */
    private void rollback(TransactionStatus transactionStatus) {
        // 获取当前事务 直接回滚
        if (transactionStatus != null) transactionUtil.rollback(transactionStatus);
    }

    /**
     * 提交事务
     */
    private void commit(TransactionStatus transactionStatus) {
        if (transactionStatus != null) transactionUtil.commit(transactionStatus);
    }
}
