package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Click2CallAuthResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private Click2CallAuthResult result;

    @Data
    public static class Click2CallAuthResult {
        private String code;
        private String message;
        private String requestId;    }
}
