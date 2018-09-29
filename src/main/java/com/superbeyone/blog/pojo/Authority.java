package com.superbeyone.blog.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: my-blog
 * @description:
 * @author: Mr.superbeyone
 * @create: 2018-09-27 16:06
 **/
@Entity
@Setter
public class Authority implements Serializable,GrantedAuthority {

    @Id
    @Getter
    @GeneratedValue
    private Integer id;


    @Column(nullable = false)
    private String name;



    @Override
    public String getAuthority() {
        return name;
    }
}
