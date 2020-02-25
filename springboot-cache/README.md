## SpringBoot Cache 演示项目

基于注解的声明式缓存

1.使用 baomidou 简化sql
2.ConfigurationProperties 

## 运行

本地安装好MySQL 5.7，并执行初始化sql脚本：`resources/sql/t_user.sql`

另外还需要安装Redis，配置好`application.yml`文件中的redis地址

测试用例：`com.javaniuniu.cache.SpringbootCacheApplicationTests.java`

参考网站
- [@ConfigurationProperties 注解使用姿势，这一篇就够了](https://blog.csdn.net/yusimiao/article/details/97622666)
- [spring boot cache redis 简单理解自定义 KeyGenerator](https://blog.51cto.com/5013162/2407951?source=dra)
