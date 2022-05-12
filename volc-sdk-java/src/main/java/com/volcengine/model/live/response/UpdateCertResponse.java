package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateCertResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    OpenAPICreatChainResponse Result;

    @Data
    public static class OpenAPICreatChainResponse {

        @JSONField(name = "ChainID")
        String ChainID;
        @JSONField(name = "Domain")
        String Domain;
        @JSONField(name = "UseWay")
        String UseWay;
        @JSONField(name = "AccountID")
        String AccountID;
    }
}
