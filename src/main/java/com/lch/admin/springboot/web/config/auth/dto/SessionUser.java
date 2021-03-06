package com.lch.admin.springboot.web.config.auth.dto;

import com.lch.admin.springboot.web.domain.user.User;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.io.Serializable;

@Getter
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}