package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityVideoAISummaryConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetActivityVideoAISummaryConfigResponseBody result;

    @Data
    public static class GetActivityVideoAISummaryConfigResponseBody {
        @JSONField(name = "PublishMode")
        Integer PublishMode;

        @JSONField(name = "IsBilingualEnabled")
        Boolean IsBilingualEnabled;
    }
}
