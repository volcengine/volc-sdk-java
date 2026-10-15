package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LiveInspectConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityLiveInspectConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityLiveInspectConfigResponseBody result;

    @Data
    public static class GetActivityLiveInspectConfigResponseBody {
        @JSONField(name = "LiveInspectConfig")
        LiveInspectConfig LiveInspectConfig;
    }
}
