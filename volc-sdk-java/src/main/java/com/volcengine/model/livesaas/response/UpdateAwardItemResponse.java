package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateAwardItemResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAwardItemResponseBody result;

    @Data
    public static class UpdateAwardItemResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}