## 集成Hibernate

SpringBoot集成Hibernate做DAO层

### 知识点
@ConfigurationProperties 获取配置文件相关参数
@PersistenceContext 类似于jpa 一种数据操作语句

## 配置

版本mysql8.0.19


## 修改application.yml

修改配置文件，主要是mysql的账号和密码

## 数据库初始化

创建数据库pos，然后执行SQL文件`src/main/resources/sql/schema.sql`，创建表

## 运行测试用例

执行对用户表增/删/改/查的测试用例：`com.javaniuniu.hibernate.SpringbootHibernateApplicationTests.java`

## 异常
```
异常：java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
原因：mysql版本不支持
解决方法：版本 5.7 -> 8.0.19
```

```
异常：org.hibernate.QueryException: Legacy-style query parameters (`?`) are no longer supported
原因：hibernate最新版本需要在参数上添加序号
解决方法：比如this.getHibernateTemplate().find("from Product p where p.pname=?", name);
改为this.getHibernateTemplate().find("from Product p where p.pname=?0", name);
多个参数依次递增
```


参考网站
- [@ConfigurationProperties 注解使用姿势，这一篇就够了](https://blog.csdn.net/yusimiao/article/details/97622666)
- [JPA @PersistenceContext和@Transactional Annotation](https://www.cnblogs.com/hrhguanli/p/4593681.html)
- 