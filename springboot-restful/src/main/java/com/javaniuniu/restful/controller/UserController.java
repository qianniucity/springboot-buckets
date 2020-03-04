package com.javaniuniu.restful.controller;

import com.javaniuniu.restful.common.MsgResponseBody;
import com.javaniuniu.restful.model.Address;
import com.javaniuniu.restful.model.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/4 9:43 AM
 */
@RestController
@RequestMapping(value = "users")
@Slf4j
public class UserController {
    private final static User user1 = new User(1, "yao", "123456");
    private final static User user2 = new User(2, "min", "123456");
    private final static Address address1 = new Address(1, "yao's home", "yao's school", user1);
    private final static Address address2 = new Address(2, "yao's home2", "yao's school2", user1);

    // 创建线程安全的Map
    private static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<>());

    static {
        users.put(1,user1);
        users.put(2,user2);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public MsgResponseBody<List<User>> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<User> userList = new ArrayList<>(users.values());
        return MsgResponseBody.success().setResult(userList);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MsgResponseBody<User> postUser(@RequestBody User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        return MsgResponseBody.success().setResult("新增成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MsgResponseBody<User> getUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        User user = users.get(id);
        return MsgResponseBody.success().setResult(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public MsgResponseBody<String> putUser(@PathVariable Integer id, @ModelAttribute User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User u = users.get(id);
        u.setName(user.getName());
        u.setPassword(user.getPassword());
        users.put(id, u);
        return MsgResponseBody.success().setResult("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public MsgResponseBody<String> deleteUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return MsgResponseBody.success().setResult("删除成功");
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public MsgResponseBody<User> getJson() {
        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        user1.setAddresses(addresses);
        return MsgResponseBody.success().setResult(user1);
    }

}
