package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class RouteAAuthResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private RouteAAuthResult result;

    @Data
    public static class RouteAAuthResult {

        private String code;

        private String message;
    }
}
