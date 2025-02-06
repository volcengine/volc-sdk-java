package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityIpBanStatusResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityIpBanStatusResponse.UpdateActivityIpBanStatusBody result;

    @Data
    public static class UpdateActivityIpBanStatusBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}
