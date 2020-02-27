# Spring Boot JPA 演示数据校验

演示项目
- @MappedSuperclass
- @DynamicInsert
- @CreationTimestamp
- @UpdateTimestamp
- @DynamicUpdate
- findById
- findOne
- getOne
- updatable=false



## 测试用例
com.javaniuniu.jpa.model.UserTest
com.javaniuniu.jpa.model.UserTTest

在终端打印SQL日志
- spring.jpa.show-sql=true

jpa2.x的getOne()/findOne()/findById()的区别及使用
- getOne()  方法返回的是实体对象的代理对象（a reference）配合@Transactional 一起使用，会回滚数据
- findOne() 适用于条件查询
- findById() 该方法的返回值是一个Optional<T>，在Optional类中有个get()方法，返回的是当前对象/值

参考网站
- [jpa2.x的getOne()/findOne()/findById()的区别及使用](https://blog.csdn.net/zx110503/article/details/81356735)