## 集成MongoDB

SpringBoot集成MongoDB访问NoSQL数据库

## docker 安装 MongoDB数据库

##### 下载镜像
```shell script
docker pull mongo:4.2-bionic
```

##### 运行启动mongo
```shell script
docker run -d -p 27018:27017 --name mongodb_4.2_bionic -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=123456 mongo:4.2-bionic
```

安装完成后，配置数据库的账号和密码：

```shell script
mongo --port 27018
use test
db.createUser(
   {
     user: "javaniuniu",
     pwd: "123456",
     roles: [ { role: "readWrite", db: "test" } ]
   }
 )
```

## 修改application.yml

修改配置文件，主要是MongoDB的连接信息

## 运行测试用例

执行对用户表增/删/改/查的测试用例：`com.javaniuniu.mongodb.SpringbootMongodbApplicationTests.java`

