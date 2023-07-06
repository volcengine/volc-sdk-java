package com.volcengine.service.maas;

import com.volcengine.model.maas.api.Api;

public class MaasException extends Exception {

    private final String code;

    private final int codeN;

    private final String msg;

    public MaasException(String code, int codeN, String msg) {
        super(msg);
        this.code = code;
        this.codeN = codeN;
        this.msg = msg;
    }

    public MaasException(Api.Error raw) {
        this(raw.getCode(), raw.getCodeN(), raw.getMessage());
    }

    public MaasException(Exception raw) {
        this("ClientSDKRequestError", 1709701, "MaaS SDK request error: " + raw.getMessage());
    }

    public String getCode() {
        return code;
    }


    public int getCodeN() {
        return codeN;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "MaasException{" + "code=" + code + ", code_n='" + codeN + '\'' + ", message='" + msg + '\'' + '}';
    }
}