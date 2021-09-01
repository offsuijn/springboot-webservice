package com.sujin.config.auth.dto;

import com.sujin.domain.user.User;
import lombok.Getter;

import javax.persistence.Entity;

@Getter
public class SessionUser {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

}
