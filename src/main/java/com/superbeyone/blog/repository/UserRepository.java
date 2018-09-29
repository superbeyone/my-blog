package com.superbeyone.blog.repository;

import com.superbeyone.blog.pojo.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: my-blog
 * @description: UserRepository
 * @author: Mr.superbeyone
 * @create: 2018-09-27 16:23
 **/
public interface UserRepository extends CrudRepository<User,Integer> {
}
