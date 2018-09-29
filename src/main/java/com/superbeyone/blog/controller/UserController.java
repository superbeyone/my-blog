package com.superbeyone.blog.controller;

import com.superbeyone.blog.commons.JsonResult;
import com.superbeyone.blog.pojo.User;
import com.superbeyone.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-blog
 * @description: 用户Controller
 * @author: Mr.superbeyone
 * @create: 2018-09-28 15:12
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PutMapping("/user")
    public JsonResult<User> save(User user) {

        JsonResult<User> result = new JsonResult<>();
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        User u = userService.save(user);
        if (u != null) {
            result.setCode(200);
            result.setMsg("添加成功");
        } else {
            result.setCode(300);
            result.setMsg("添加失败");
        }
        result.setData(u);
        return result;
    }

}
