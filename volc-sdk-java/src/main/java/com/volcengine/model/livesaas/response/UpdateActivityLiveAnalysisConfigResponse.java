package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityLiveAnalysisConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityLiveAnalysisConfigResponseBody result;

    @Data
    public static class UpdateActivityLiveAnalysisConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
