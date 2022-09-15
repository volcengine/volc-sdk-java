package com.volcengine.model.tls.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attempt {
    boolean success;
    String requestId;
    String errorCode;
    String errorMessage;
    int httpCode = -1;

    public Attempt(boolean success, String requestId, String errorCode, String errorMessage) {
        this.success = success;
        this.requestId = requestId;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
