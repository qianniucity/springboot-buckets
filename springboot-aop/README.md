## SpringBoot AOP演示项目-数据校验篇
#### 一句话简介知识点
Spring AOP面向切面编程，可以用来配置 **事务**、**做日志**、**权限验证**、**在用户请求时做一些处理**等等
CommandLineRunner,实现在项目启动后执行的功能可以用来做 **预先数据的加载**

#### 面向切面编程

##### 几个重要概念搞清楚就行

* 执行点（Executepoint） - 类初始化，方法调用。
* 连接点（Joinpoint）    - 执行点+方位的组合，可确定Joinpoint，比如类开始初始化前，类初始化后，方法调用前，方法调用后。
* 切点（Pointcut）       - 在众多执行点中，定位感兴趣的执行点。Executepoint相当于数据库表中的记录，而Pointcut相当于查询条件。
* 增强（Advice）         - 织入到目标类连接点上的一段程序代码。除了一段程序代码外，还拥有执行点的方位信息。
* 目标对象（Target）     - 增强逻辑的织入目标类
* 引介（Introduction）   - 一种特殊的增强（advice），它为类添加一些额外的属性和方法，动态为业务类添加其他接口的实现逻辑，让业务类成为这个接口的实现类。
* 代理（Proxy）          - 一个类被AOP织入后，产生一个结果类，它便是融合了原类和增强逻辑的代理类。
* 切面（Aspect）         - 切面由切点（Pointcut）和增强（Advice/Introduction）组成，既包括横切逻辑定义，也包括连接点定义。

##### AOP工作重点：

1. 如何通过切点（Pointcut）和增强（Advice）定位到连接点（Jointpoint）上；
2. 如何在增强（Advice）中编写切面的代码。

##### 主要注解
- @Pointcut切点注解
- @Before 在切点方法之前执行
- @After 在切点方法之后执行
- @AfterReturning 切点方法返回后执行
- @AfterThrowing 切点方法抛异常执行
- @Around 属于环绕增强，能控制切点执行前，执行后，，用这个注解后，程序抛异常，会影响@AfterThrowing这个注解

##### 执行前后顺序是这样
- @Around环绕通知
- @Before通知执行
- @Before通知执行结束
- @Around环绕通知执行结束
- @After后置通知执行了!
- @AfterReturning第一个后置返回通知的返回值：18

#### springboot-aop 相关示例

| 项目名称 | 文章地址 |
|:--- |:---   |
|springboot-aop-log|[SpringBoot AOP演示项目-日志篇](../springboot-aop-log)|
|springboot-aop-exception|[SpringBoot AOP演示项目-异常扑获](../springboot-aop-exception)|
|springboot-aop-transactional|[SpringBoot AOP演示项目-事务篇](../springboot-aop-transactional)|
|springboot-aop-format|[SpringBoot AOP演示注解的形式去除请求参数首尾空格](../springboot-aop-format)|


参考文档：
- [Aspect配置说明](http://javaniuniu.com/Spring/Aspect/explanation)
- [Aspect实现样例](http://javaniuniu.com/Spring/Aspect)
- [springboot启动时执行任务CommandLineRunner](https://www.cnblogs.com/myblogs-miller/p/9046425.html)
- [自定义注释](http://javaniuniu.com/Annotation/myself)
- [java中VO的使用(VO视图对象)](http://javaniuniu.com/java-code-design-data/vo)
- [Lombok 实战](http://javaniuniu.com/Annotation/Lombok)
- [logback 常用配置（详解）](https://blog.csdn.net/qq_36850813/article/details/83092051)
