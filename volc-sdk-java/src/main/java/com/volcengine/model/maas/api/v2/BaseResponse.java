package com.volcengine.model.maas.api.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BaseResponse {
    /**
     * requestId
     * <p>
     *
     *
     */
    @JsonProperty("requestId")
    private String requestId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }
}
