## SpringBoot AOP演示项目-事务篇
通过AOP机制加注解（Annotation）方式实现事务,事务源为JDBC数据源下的DataSourceTransactionManager        
并整合Swagger-UI-2.9.2进行调试，数据库采用MySQL

### @Transactional 注解管理事务的实现步骤
**第一步** 在配置类中添加 @EnableTransactionManagement

**第二步** 将@Transactional 注解添加到合适的方法上，并设置合适的属性信息。@Transactional 注解的属性信息如表展示

|属性名|说明|
|:---|:---|
| name|	当在配置文件中有多个 TransactionManager , 可以用该属性指定选择哪个事务管理器。|
| propagation	|事务的传播行为，默认值为 REQUIRED。|
| isolation|	事务的隔离度，默认值采用 DEFAULT。|
| timeout	|事务的超时时间，默认值为-1。如果超过该时间限制但事务还没有完成，则自动回滚事务。|
| read-only	|指定事务是否为只读事务，默认值为 false；为了忽略那些不需要事务的方法，比如读取数据，可以设置 read-only 为 true。|
| rollback-for	|用于指定能够触发事务回滚的异常类型，如果有多个异常类型需要指定，各类型之间可以通过逗号分隔。|
| no-rollback- for	|抛出 no-rollback-for 指定的异常类型，不回滚事务。|

示例如     
com.javaniuniu.transactional.service.impl.SysUserServiceImpl
com.javaniuniu.transactional.service.impl.SysDepartmentServiceImpl

### 切面编程为通用编程方式，可参考下面链接

### 事务管理机制还支持JTA、Hibernate、JPA      
pring事务管理涉及的接口的联系如下：

![pic](./images/1169376-20180727203621139-1740858945.png)

参考链接
- [使用SpringAOP实现事务](https://blog.csdn.net/csdn_huzeliang/article/details/78995795)
- [Mysql中key 、primary key 、unique key 与index区别](https://www.cnblogs.com/zjfjava/p/6922494.html)
- [Aspect配置说明](http://javaniuniu.com/Spring/Aspect/explanation)
- [Spring事务管理 与 SpringAOP](https://www.cnblogs.com/xdyixia/p/9376077.html)