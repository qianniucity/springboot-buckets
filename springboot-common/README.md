## Spring Boot common通用工具

| 类型 | 编码 | 代码描述|使用场景|
|:--- |:---  |:--- |:--- |
|消息提醒封装|[AjaxResult](./src/main/java/com.javaniuniu/common/code/domain/AjaxResult.java)|继承HashMap|常用于response数据到前端|
|消息提醒封装|[MsgResponseBody](./src/main/java/com/javaniuniu/common/code/domain/MsgResponseBody.java)|范型|常用于response数据到前端|
|常见Entity基类|[BaseEntity](./src/main/java/com.javaniuniu/common/code/domain/BaseEntity.java)|||
|Ztree树结构实体类|[Ztree](./src/main/java/com.javaniuniu/common/code/domain/Ztree.java)||用于menu 中|
|字符串工具类|[StringUtils](./src/main/java/com/javaniuniu/common/utils/StringUtils.java)|继承org.apache.commons.lang3.StringUtils|字符串判断|
|时间工具类1|[DateUtil](./src/main/java/com/javaniuniu/common/utils/DateUtil.java)|||
|时间工具类2|[DateUtils](./src/main/java/com/javaniuniu/common/utils/DateUtils.java)|||
|字符集工具类|[CharsetKit](./src/main/java/com.javaniuniu/common/code/text/CharsetKit.java)||转UTF-8编码|
|类型转换器|[Convert](./src/main/java/com.javaniuniu/common/code/text/Convert.java)||继承类型之间转换|
|字符串格式化|[StrFormatter](./src/main/java/com.javaniuniu/common/code/text/StrFormatter.java)|||
|Excel导入导出|[Excel](./src/main/java/com.javaniuniu/common/annotation/Excel.java),[Excels](./src/main/java/com.javaniuniu/common/annotation/Excels.java),[ExcelUtil](./src/main/java/com.javaniuniu/common/utils/poi/Excels.java)|||
|反射工具类(Excel中使用)|[ReflectUtils](./src/main/java/com.javaniuniu/common/utils/reflect/ReflectUtils.java)||主要用于Excel中|
|反射工具类(通用)|[Reflections](./src/main/java/com.javaniuniu/common/utils/reflect/Reflections.java)||通用|

### [sql文件](./sql/ry_20191122.sql)





参考链接
- [反射工具类(Reflections)](http://javaniuniu.com/web/Reflections/util)
- [Java反射说明](http://javaniuniu.com/web/Reflections/explanation)
- [将反射时的checked exception转换为unchecked exception](./src/main/java/com.javaniuniu/common/utils/reflect/ReflectUtils.java)