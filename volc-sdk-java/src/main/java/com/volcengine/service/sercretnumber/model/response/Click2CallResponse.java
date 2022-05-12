package com.volcengine.service.sercretnumber.model.response;

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
public class Click2CallResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    private Click2CallResult result;

    @Data
    public static class Click2CallResult {
        private String callId;
    }
}
