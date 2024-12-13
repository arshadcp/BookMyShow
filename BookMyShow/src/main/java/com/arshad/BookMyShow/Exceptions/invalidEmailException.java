package com.arshad.BookMyShow.Exceptions;

public class invalidEmailException extends RuntimeException{
    public invalidEmailException() {
    }

    public invalidEmailException(String message) {
        super(message);
    }

    public invalidEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidEmailException(Throwable cause) {
        super(cause);
    }

    public invalidEmailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
