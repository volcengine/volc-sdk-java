package com.volcengine.service.vikingDB.common;

import lombok.Data;

@Data
public class ExceptionDetails {
    private String message;
    private int code;
    private String requestId;

    public ExceptionDetails(String message, int code, String requestId) {
        this.message = message;
        this.code = code;
        this.requestId = requestId;
    }
}
