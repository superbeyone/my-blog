package com.superbeyone.blog.service.impl;

import com.superbeyone.blog.pojo.User;
import com.superbeyone.blog.repository.UserRepository;
import com.superbeyone.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: my-blog
 * @description:
 * @author: Mr.superbeyone
 * @create: 2018-09-28 15:13
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
