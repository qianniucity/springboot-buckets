package com.javaniuniu.aop.aspect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class UserAccessAspect {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Pointcut("execution(public * com.javaniuniu.aop.controller.*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable{
        log.info("@Before通知执行");
        //获取目标方法参数信息
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg ->{
            try{
                log.info(OBJECT_MAPPER.writeValueAsString(arg));
            } catch (JsonProcessingException e) {
                log.info(arg.toString());
            }
        });

        //aop代理对象
        Object aThis = joinPoint.getThis();
        log.info(aThis.toString());//com.javaniuniu.aop.controller.HelloController@6b66d781

        //被代理对象
        Object target = joinPoint.getTarget();
        log.info(target.toString());//HelloController@6b66d781

        //获取连接点的方法签名对象
        Signature signature = joinPoint.getSignature();
        log.info(signature.toLongString());//Object com.javaniuniu.aop.controller.HelloController.first(User)
        log.info(signature.toShortString());//Object com.javaniuniu.aop.controller.HelloController.first(User)
        log.info(signature.toString());//Object com.javaniuniu.aop.controller.HelloController.first(User)

        //获取方法名
        log.info(signature.getName());//Object com.javaniuniu.aop.controller.HelloController.first(User)

        //获取声明类型名
        log.info(signature.getDeclaringTypeName());//Object com.javaniuniu.aop.controller.HelloController.first(User)

        //获取声明类型 方法所在类的class对象
        log.info(signature.getDeclaringType().toString());////Object com.javaniuniu.aop.controller.HelloController.first(User)

        //和getDeclaringTypeName()一样
        log.info(signature.getDeclaringType().getName());////Object com.javaniuniu.aop.controller.HelloController.first(User)

        //连接点类型
        String kind = joinPoint.getKind();
        log.info(kind);//method-execution

        //返回连接点方法所在类文件中的位置 打印报异常
//        SourceLocation sourceLocation = joinPoint.getSourceLocation();
//        log.info(sourceLocation.toString());
//        log.info(sourceLocation.getFileName());//
//        log.info(sourceLocation.getLine()+"");
//        log.info(sourceLocation.getWithinType().toString());

        ///返回连接点静态部分
        JoinPoint.StaticPart staticPart = joinPoint.getStaticPart();
        log.info(staticPart.toLongString());//execution(Object com.javaniuniu.aop.controller.HelloController.first(User))

        //attributes可以获取request信息 session信息等
        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info(request.getRequestURL().toString());//http://127.0.0.1:8080/aop/first
        log.info(request.getRemoteAddr()); //127.0.0.1
        log.info(request.getMethod()); //POST

        log.info("before通知执行结束");
    }

    /**
     * 后置返回
     * 如果第一个参数为JoinPoint，则第二个参数为返回值的信息
     * 如果第一个参数不为JoinPoint，则第一个参数为returning中对应的参数
     * returning：限定了只有目标方法返回值与通知方法参数类型匹配时才能执行后置返回通知，否则不执行，
     * 参数为Object类型将匹配任何目标返回值
     */
    @AfterReturning(value = "webLog()",returning = "result")
    public void doAfterReturningAdvice1(String result){
        log.info("第一个后置返回通知的返回值："+result);//name:minpage:16
    }


    @AfterReturning(value = "webLog()",returning = "result",argNames = "result")
    public void doAfterReturningAdvice2(String result){
        log.info("第二个后置返回通知的返回值："+result);//name:minpage:16
    }

    /**
     * 后置异常通知
     * 定义一个名字，该名字用于匹配通知实现方法的一个参数名，当目标方法抛出异常返回后，将把目标方法抛出的异常传给通知方法；
     * throwing:限定了只有目标方法抛出的异常与通知方法相应参数异常类型时才能执行后置异常通知，否则不执行，
     * 对于throwing对应的通知方法参数为Throwable类型将匹配任何异常。
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "webLog()",throwing = "exception")
    public void doAfterThrowingAdvice(JoinPoint joinPoint,Throwable exception){
        log.info(joinPoint.getSignature().getName());
        if(exception instanceof NullPointerException){
            log.info("发生了空指针异常!!!!!");
        }
    }

    @After("webLog()")
    public void doAfterAdvice(JoinPoint joinPoint){
        log.info("后置通知执行了!");
    }

    /**
     * 环绕通知：
     * 注意:Spring AOP的环绕通知会影响到AfterThrowing通知的运行,不要同时使用
     *
     * 环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     * 环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     */
    @Around("execution(public * com.javaniuniu.aop.controller.*.*(..)) && @annotation(com.javaniuniu.aop.aspect.UserAccess)")
    public Object doAroundAdvice(ProceedingJoinPoint pjp){
        log.info("@Around环绕通知："+pjp.getSignature().toString());//Object com.javaniuniu.aop.controller.HelloController.first(User)
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        UserAccess userAccess = method.getAnnotation(UserAccess.class);
        if (!StringUtils.isEmpty(userAccess.desc())) {
            log.info("annotation around:" + userAccess.desc());
        }
        Object obj = null;
        try {
            obj = pjp.proceed(); //可以加参数
            log.info(obj.toString());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("@Around环绕通知执行结束");
        return obj;
    }
}

