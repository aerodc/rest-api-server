package com.dixi.bean;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by liudixi on 19/12/16.
 */
public class UserLogin {

    @NotEmpty
    private String login;

    public UserLogin() {
    }

    public UserLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLogin userLogin = (UserLogin) o;

        return login != null ? login.equals(userLogin.login) : userLogin.login == null;
    }

    @Override
    public int hashCode() {
        return login != null ? login.hashCode() : 0;
    }
}
