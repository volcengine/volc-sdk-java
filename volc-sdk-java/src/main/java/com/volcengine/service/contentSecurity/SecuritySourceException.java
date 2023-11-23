package com.volcengine.service.contentSecurity;

public class SecuritySourceException extends Exception{

    private String code;

    private String msg;

    public SecuritySourceException(String message) {
        super(message);
        this.code = "SecuritySourceClientSDKRequestError";
        this.msg = message;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "SecuritySourceException{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
