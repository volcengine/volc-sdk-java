package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.beans.livesaas.InteractionScriptRecordConfig;

import lombok.Data;

@Data
public class GetInteractionScriptRecordConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetInteractionScriptRecordConfigResponseBody result;

    @Data
    public static class GetInteractionScriptRecordConfigResponseBody {
        @JSONField(name = "Config")
        InteractionScriptRecordConfig Config;
    }
}
