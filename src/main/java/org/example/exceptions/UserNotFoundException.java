package org.example.exceptions;

public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(String msg) {
        super(msg);
    }
}
