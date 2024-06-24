package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteAudienceGroupResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteAudienceGroupBody result;

    @Data
    public static class DeleteAudienceGroupBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}