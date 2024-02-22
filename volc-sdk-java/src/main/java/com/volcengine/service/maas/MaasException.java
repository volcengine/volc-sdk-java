package com.volcengine.service.maas;

import com.volcengine.model.maas.api.Api;
import com.volcengine.model.maas.api.v2.Error;
import lombok.Getter;

@Getter
public class MaasException extends Exception {

    private final String code;

    private final int codeN;

    private final String msg;

    private final String requestId;

    public MaasException(String code, int codeN, String msg, String requestId) {
        super(msg);
        this.code = code;
        this.codeN = codeN;
        this.msg = msg;
        this.requestId = requestId;
    }

    public MaasException(Api.Error raw, String requestId) {
        this(raw.getCode(), raw.getCodeN(), raw.getMessage(), requestId);
    }

    public MaasException(Error raw, String requestId) {
        this(raw.getCode(), raw.getCodeN(), raw.getMessage(), requestId);
    }

    public MaasException(Exception raw, String requestId) {
        this("ClientSDKRequestError", 1709701, "MaaS SDK request error: " + raw.getMessage(), requestId);
    }

    public MaasException(String raw, String requestId) {
        this("ClientSDKRequestError", 1709701, "MaaS SDK request error: " + raw, requestId);
    }

    public MaasException(Exception raw, int codeN, String requestId) {
        this("ClientSDKRequestError", codeN, "MaaS SDK request error: " + raw.getMessage(), requestId);
    }


    @Override
    public String toString() {
        return "MaasException{" + "code=" + code + ", code_n='" + codeN + '\'' + ", message='" + msg + '\'' + ", request_id='" + requestId + '\'' + '}';
    }
}