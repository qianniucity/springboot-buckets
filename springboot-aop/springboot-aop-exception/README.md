## SpringBoot AOP演示项目-异常扑获
@ControllerAdvice，是Spring3.2提供的新注解,它是一个Controller增强器,可对controller中被 @RequestMapping注解的方法加一些逻辑处理。最常用的就是异常处理
#### 统一异常处理
需要配合@ExceptionHandler使用。 当将异常抛到controller时,可以对异常进行统一处理,规定返回的json格式或是跳转到一个错误页面

参考链接
- [springboot+aop+自定义注解，打造通用的全局异常处理和参数校验切面（通用版）](https://www.cnblogs.com/telwanggs/p/10875498.html)