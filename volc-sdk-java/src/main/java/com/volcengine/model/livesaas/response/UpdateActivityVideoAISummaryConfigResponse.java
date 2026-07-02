package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityVideoAISummaryConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    UpdateActivityVideoAISummaryConfigResponseBody result;

    @Data
    public static class UpdateActivityVideoAISummaryConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
