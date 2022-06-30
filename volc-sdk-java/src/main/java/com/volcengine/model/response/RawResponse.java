package com.volcengine.model.response;

import lombok.Data;
import org.apache.http.Header;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class RawResponse {

    private byte[] data;
    private int code;
    private Exception exception;
    private Map<String,String> headers;

    public RawResponse(byte[] data, int code, Exception e) {
        this.data = data;
        this.code = code;
        this.exception = e;
    }
}
