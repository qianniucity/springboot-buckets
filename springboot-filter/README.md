## Spring Boot演示过滤器去除请求参数首尾空格

需求：去除用户表单参数中由于用户不小心输入的前后空格，防止因为前后空格原因引起业务异常
- 实现方式一：前端参数传入的时候去除首尾空格
- 实现方式二：后端接收参数对参数处理，去除参数首尾空格后再做其他业务
- 实现方式三：利用Filter处理所有的请求，去除请求参数首尾空格重新写回


HttpServletRequest 提供的获取参数的方法：
```
String getParameter(String name);//键值对参数
Map<String,String[]> getParameterMap();//键值对参数
Enumeration <String> getParameterNames();//键值对参数
String[] getParameterValues(String name);//键值对参数
ServletInputStream getInputStream();// 文本参数，例如类型 application/json 等
BufferedReader getReader(); //文本参数，例如类型 application/json 等
Collection<Part> getParts();//表单提交， multipart/form-data	
```

测试
- GET http://127.0.0.1:8080/getUserAndId?userName=   lkjjlkjl&id=123456
- GET http://127.0.0.1:8080/getUserAndPassword?userName=   lkjjlkjl&password=  123456
- POST http://127.0.0.1:8080/postUserAndPassword?userName=   lkjjlkjl&password=  123456
- POST http://127.0.0.1:8080/postUserAndId?userName=   lkjjlkjl&id=123456
- http://127.0.0.1:8080/postUser  {"id":1  ,"name":"  ddd  "}

已完成
1. 可过滤参数，无法返回参数 (解决，原因是必要参数没传递)
2. 过滤器执行 太靠前  所有请求参数都过滤 （通过throw exception 在后面处理）
3. 过滤设计（配合exception 思路就清晰了）

Filter 参考链接
- [Filter相关文档](http://javaniuniu.com/Filter/explanation)