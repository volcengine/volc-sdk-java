package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityLiveAnalysisConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityLiveAnalysisConfigResponseBody result;

    @Data
    public static class GetActivityLiveAnalysisConfigResponseBody {
        @JSONField(name = "IsLiveAnalysisEnable")
        Integer IsLiveAnalysisEnable;
    }
}
