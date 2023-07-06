package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


@Data
public class UpdatePopularitySettingsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdatePopularitySettingsResponseBody result;

    @Data
    public static class UpdatePopularitySettingsResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}