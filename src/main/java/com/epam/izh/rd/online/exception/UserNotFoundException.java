package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception {
    @Override
    public String toString() {
        return "Пользователь с таким логином не найден";
    }
}
