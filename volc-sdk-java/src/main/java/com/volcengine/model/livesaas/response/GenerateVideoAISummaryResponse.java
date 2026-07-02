package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GenerateVideoAISummaryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GenerateVideoAISummaryResponseBody result;

    @Data
    public static class GenerateVideoAISummaryResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
