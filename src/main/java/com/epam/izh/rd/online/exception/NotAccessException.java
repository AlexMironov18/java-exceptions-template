package com.epam.izh.rd.online.exception;

public class NotAccessException extends Exception {
    @Override
    public String toString() {
        return "Недостаточно прав для выполнения операции";
    }
}
