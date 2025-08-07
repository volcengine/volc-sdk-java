package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CustomLinkConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetAccountCustomLinkConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAccountCustomLinkConfigResponseBody result;

    @Data
    public static class GetAccountCustomLinkConfigResponseBody {
        @JSONField(name = "CustomLinkConfig")
        CustomLinkConfig CustomLinkConfig;
    }
}