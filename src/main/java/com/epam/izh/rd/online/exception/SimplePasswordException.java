package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {
    @Override
    public String toString() {
        return "Пароль не соответствует требованиям безопасности";
    }
}
