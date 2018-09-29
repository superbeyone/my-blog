package com.superbeyone.blog.commons;

import lombok.Data;

/**
 * @program: my-blog
 * @description: 统一返回Json对象
 * @author: Mr.superbeyone
 * @create: 2018-09-28 15:14
 **/
@Data
public class JsonResult<T> {
    private Integer code;
    private String msg;
    private T data;
}
