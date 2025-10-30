package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateAwardConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAwardConfigResult result;

    @Data
    public static class UpdateAwardConfigResult {
        @JSONField(name = "Status")
        Boolean Status;
        @JSONField(name = "Id")
        Long Id;
    }
}
