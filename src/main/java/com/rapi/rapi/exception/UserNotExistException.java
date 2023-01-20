package com.rapi.rapi.exception;

/**
 * @author leonid.barsucovschi
 */
public class UserNotExistException extends RuntimeException{
    public UserNotExistException(String message) {
        super(message);
    }
}
