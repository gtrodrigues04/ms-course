package com.devsuperior.hr_oauth.entities;

import java.io.Serializable;

public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String roleName;

    public Role() {
    }

    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
}
