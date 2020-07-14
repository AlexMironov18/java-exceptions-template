package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {
    @Override
    public String toString() {
        return "Пароль введен неверно!";
    }
}
