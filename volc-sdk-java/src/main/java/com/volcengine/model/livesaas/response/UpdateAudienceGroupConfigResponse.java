package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAudienceGroupConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAudienceGroupConfigBody result;

    @Data
    public static class UpdateAudienceGroupConfigBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}