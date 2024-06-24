package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateAudienceGroupUserConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAudienceGroupUserConfigBody result;

    @Data
    public static class UpdateAudienceGroupUserConfigBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}