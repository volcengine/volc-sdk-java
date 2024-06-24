package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class AddAudienceGroupResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AddAudienceGroupBody result;

    @Data
    public static class AddAudienceGroupBody {
        @JSONField(name = "AudienceGroupId")
        Long AudienceGroupId;
    }
}