package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateAccountCustomLinkConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAccountCustomLinkConfigResponseBody result;

    @Data
    public static class UpdateAccountCustomLinkConfigResponseBody {
        @JSONField(name = "Status")
        private Integer Status;
    }
}