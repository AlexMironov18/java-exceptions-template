package com.epam.izh.rd.online.exception;

import com.epam.izh.rd.online.entity.User;

public class UserAlreadyRegisteredException extends Exception {
    User user;
    public UserAlreadyRegisteredException(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "Пользователь с логином " + user.getLogin() + " уже зарегистрирован";
    }
}
