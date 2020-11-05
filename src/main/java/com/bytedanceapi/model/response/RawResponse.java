package com.bytedanceapi.model.response;

import lombok.Data;

@Data
public class RawResponse {

    private byte[] data;
    private int code;
    private Exception exception;


    public RawResponse(byte[] data, int code, Exception e) {
        this.data = data;
        this.code = code;
        this.exception = e;
    }
}
