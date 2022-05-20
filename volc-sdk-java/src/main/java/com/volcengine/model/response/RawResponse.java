package com.volcengine.model.response;

import lombok.Data;
import com.volcengine.model.Header;

@Data
public class RawResponse {

    private byte[] data;
    private int code;
    private Exception exception;

    public RawResponse() {
    }
    //response header and origin http response code
    private Header[] headers;
    private int httpCode;

    public RawResponse(byte[] data, int code, Exception e) {
        this.data = data;
        this.code = code;
        this.exception = e;
    }

    public RawResponse(byte[] data, int code, Exception exception, Header[] headers) {
        this.data = data;
        this.code = code;
        this.exception = exception;
        this.headers = headers;
    }

    public RawResponse(byte[] data, int code, Exception exception, Header[] headers, int httpCode) {
        this.data = data;
        this.code = code;
        this.exception = exception;
        this.headers = headers;
        this.httpCode = httpCode;
    }

    public String getFirstHeader(String key) {
        if (key != null && headers != null) {
            for (Header header : headers) {
                if (header.getName().equalsIgnoreCase(key)) {
                    return header.getValue();
                }
            }
        }
        return null;
    }
}
