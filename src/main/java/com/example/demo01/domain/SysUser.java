package com.example.demo01.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {
    private Long id;

    private String username;

    private String email;

    private String password;

    private String phonenum;

    private static final long serialVersionUID = 1L;
}