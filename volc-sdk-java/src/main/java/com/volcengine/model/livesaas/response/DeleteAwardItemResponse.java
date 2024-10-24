package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteAwardItemResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteAwardItemResponseBody result;

    @Data
    public static class DeleteAwardItemResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}