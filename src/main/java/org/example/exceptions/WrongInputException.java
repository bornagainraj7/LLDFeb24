package org.example.exceptions;

public class WrongInputException extends RuntimeException {
    WrongInputException(String msg) {
        super(msg);
    }
}

// If we extend RuntimeException then it is unchecked exception and if it extends Exception then its a Checked exception
