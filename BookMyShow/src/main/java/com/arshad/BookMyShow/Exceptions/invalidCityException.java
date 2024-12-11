package com.arshad.BookMyShow.Exceptions;

public class invalidCityException extends RuntimeException{
    public invalidCityException() {
    }

    public invalidCityException(String message) {
        super(message);
    }

    public invalidCityException(Throwable cause) {
        super(cause);
    }

    public invalidCityException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidCityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
