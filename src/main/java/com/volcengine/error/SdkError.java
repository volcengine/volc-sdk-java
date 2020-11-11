package com.volcengine.error;

public enum SdkError {
    UNKNOWN(-1),
    SUCCESS(0),
    ENOAPI(10001),
    ENOFILE(10002),
    ERESP(10003),
    ESIGN(10004),
    EHTTP(10005),
    EINTERNAL(10006),
    EENCODING(10007),
    EUPLOAD(10008);


    private final int value;

    SdkError(final int value) {
        this.value = value;
    }

    public static final String getErrorDesc(SdkError errorType) {
        switch (errorType) {
            case UNKNOWN:
                return "unkown error";
            case SUCCESS:
                return "success";
            case ENOAPI:
                return "no this api";
            case ENOFILE:
                return "cant find file";
            case ERESP:
                return "response error";
            case ESIGN:
                return "sign error";
            case EHTTP:
                return "http request error";
            case EENCODING:
                return "encoding error";
            case EINTERNAL:
                return "internal error";
            case EUPLOAD:
                return "upload error";
            default:
                return "unknown error";
        }
    }

    public final int getNumber() {
        return this.value;
    }
}
