package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ModifyAudienceGroupResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ModifyAudienceGroupBody result;

    @Data
    public static class ModifyAudienceGroupBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}