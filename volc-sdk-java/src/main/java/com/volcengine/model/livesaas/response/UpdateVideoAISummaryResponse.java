package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateVideoAISummaryResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateVideoAISummaryResponseBody result;

    @Data
    public static class UpdateVideoAISummaryResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
