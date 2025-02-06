package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityUserBanStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityUserBanStatusResponse.UpdateActivityUserBanStatusBody result;

    @Data
    public static class UpdateActivityUserBanStatusBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
