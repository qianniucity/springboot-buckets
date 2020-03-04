## Spring boot实现RESTful API接口

### 知识点：
- 解决JSON返回死循环问题
- 统一的基础返回类

### 测试

- GET http://127.0.0.1:8080/users/
- POST http://127.0.0.1:8080/users/ {"id":33,"name":"  ddd  ","password":"123","addresses":[{"id":1,"home":"home1","school":"ss","user":null}]}
- GET http://127.0.0.1:8080/users/1
- PUT http://127.0.0.1:8080/users/1  {"id":33,"name":"  ddd  ","password":"123","addresses":[{"id":1,"home":"home1","school":"ss","user":null}]}
- DELETE http://127.0.0.1:8080/users/1
- GET http://127.0.0.1:8080/users/json

### 出现过的异常
```
异常：Could not write JSON: Infinite recursion (StackOverflowError)
原因：返回的json数据死循环
解决方法：在父类get方法添加 @JsonManagedReference 子类get方法添加 @JsonBackReference
```
```
异常：Cannot deserialize instance of
原因：参数为List 少用了 [] 
解决方法： 在入参值上面添加 []
```


参考链接
- [Could not write JSON: Infinite recursion (StackOverflowError)](https://blog.csdn.net/east123321/article/details/80435051)
- [static{}静态代码块与{}普通代码块之间的区别](https://www.cnblogs.com/lukelook/p/11183155.html)