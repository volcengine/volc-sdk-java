package com.volcengine.model.tls.exception;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.ERROR_CODE;
import static com.volcengine.model.tls.Const.ERROR_MESSAGE;
@NoArgsConstructor
public class LogException extends Exception {
    private int httpCode;
    @JSONField(name = ERROR_CODE)
    private String errorCode;
    @JSONField(name = ERROR_MESSAGE)
    private String errorMessage;
    private String requestId;

    public LogException(String errorCode, String errorMessage, String requestId) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.requestId = requestId;
        this.httpCode = -1;
    }

    public LogException(int httpCode, String errorCode, String errorMessage, String requestId) {
        super(errorMessage);
        this.httpCode = httpCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.requestId = requestId;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "LogException{" +
                "httpCode=" + httpCode +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
