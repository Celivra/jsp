package com.celivra.javawebendhomework.Model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    public User() {}
    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
