package com.devsuperior.hr_oauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String password;

    private String email;

    private Set<Role> roles = new HashSet<>();

    public User() {

    }

    public User(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
