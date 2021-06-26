package com.zzy.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Frichas
 * @version 1.0
 * @date 2021/6/25 12:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDo {
    private String id;
    private String username;
    private String password;
    private String realName;
    private List<String> roles;
    private List<String> permissions;

}
