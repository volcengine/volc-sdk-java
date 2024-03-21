package com.volcengine.service.maas.response;

import java.io.InputStream;

public class BinaryResponseContent {

    private final String requestId;

    private final InputStream response;

    public BinaryResponseContent(InputStream response, String requestId) {
        this.requestId = requestId;
        this.response = response;
    }

    public String getRequestId() {
        return requestId;
    }

    public InputStream getResponse() {
        return response;
    }
}
