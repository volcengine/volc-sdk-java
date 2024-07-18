package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GenerateActivityStreamSliceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GenerateActivityStreamSliceResponseBody result;

    @Data
    public static class GenerateActivityStreamSliceResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}