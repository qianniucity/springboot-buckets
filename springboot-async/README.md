## 异步线程池-三种方式
- @Ansync 
- DeferredResult
- WebAsyncTask

演示在SpringBoot中如何使用异步线程池

## 主要类
- AsyncUncaughtExceptionHandler 处理异常 通过继承 `AsyncConfigurer` 可得
- ThreadPoolTaskExecutor 线程池配置 ，异步处理伴随着多请求，少不了线程处理

## 主要注解
- @Ansync 方法注解
- @EnableAsync 类注解，可在配置类中添加 



#### 参考文档
- [Spring Boot @Async 异步异常处理](https://www.jianshu.com/p/11c78717799b)
- [ThreadPoolTaskExecutor](https://blog.csdn.net/hry2015/article/details/67640534?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task)
- [单元测试的框架Hamcrest](https://blog.csdn.net/king101125s/article/details/104456577)
- [DeferredResult——异步请求处理](https://blog.csdn.net/m0_37595562/article/details/81013909)
- [实战Spring Boot 2.0系列(四) - 使用WebAsyncTask处理异步任务](https://blog.csdn.net/baidu_22254181/article/details/80789090)