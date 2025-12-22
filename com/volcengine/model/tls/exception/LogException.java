package com.volcengine.model.tls.exception;

public class LogException extends Exception {
    public LogException(String message) {
        super(message);
    }
    
    public LogException(String message, Throwable cause) {
        super(message, cause);
    }
}