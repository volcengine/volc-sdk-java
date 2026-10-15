package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityLiveInspectConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityLiveInspectConfigResponseBody result;

    @Data
    public static class UpdateActivityLiveInspectConfigResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
