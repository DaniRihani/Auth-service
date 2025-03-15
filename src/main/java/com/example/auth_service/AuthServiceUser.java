package com.example.auth_service;


import java.util.Objects;

public class AuthServiceUser {
    private String user;
    private String password;

    public AuthServiceUser() {}

    public AuthServiceUser(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthServiceUser that = (AuthServiceUser) o;
        return Objects.equals(user, that.user) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }
}
