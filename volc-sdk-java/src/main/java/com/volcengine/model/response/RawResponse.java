package com.volcengine.model.response;

import lombok.Data;
import org.apache.http.Header;

import java.io.PrintWriter;
import java.io.StringWriter;

@Data
public class RawResponse {

    private byte[] data;
    private int code;
    private Exception exception;
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

    public String getVerboseExceptionMessage() {
        if (this.getException() == null) {
            return null;
        }
        StringBuilder msg = new StringBuilder();
        msg.append(this.getException().getMessage()).append(":");
        if (this.getHeaders() != null) {
            for (Header header : this.getHeaders()) {
                if (header != null) {
                    msg.append("Header name is ").append(header.getName()).
                            append(", value is ").append(header.getValue()).append(System.lineSeparator());
                }
            }
        }
        msg.append("http code is ").append(this.getHttpCode());

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        this.getException().printStackTrace(pw);
        msg.append(System.lineSeparator()).append(sw);
        return msg.toString();
    }
}
