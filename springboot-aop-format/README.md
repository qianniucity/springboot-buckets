## springboot-aop-format 通过注解的形式去除请求参数首尾空格

目前SpringBoot非常流行，大大简化了Spring整合Mybatis,SpringMVC的配置。但是另外的一件烦心事来了，那就是写接口时候，前后端都需要对String类型的字段做好去首尾空格处理，该项工作简单但是繁琐，虽不费心，但是劳神。在这里写了个注解，在接口进入controller前实现去除字符串去除首尾空格功能。

该示例通过自定义注解+反射对数据的操作

测试
- POST http://127.0.0.1:8080/paramsNotNull?name=mmm
- POST http://127.0.0.1:8080/userNotNull  {"id":33,"name":"  ddd  "}

### 总结
1. 通过该示例稍做修改 可实现对数据的操作
2. 对数据的操作多用到了反射


参考链接
- [Spring Boot之基于注解的数据格式化](https://blog.csdn.net/jrainbow/article/details/52382728)
- [注解式控制器的数据验证、类型转换及格式化 SpringMVC数据格式化](https://blog.csdn.net/soundfly/article/details/17380741)