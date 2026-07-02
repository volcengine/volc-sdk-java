package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateVideoAISummaryStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateVideoAISummaryStatusResponseBody result;

    @Data
    public static class UpdateVideoAISummaryStatusResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
