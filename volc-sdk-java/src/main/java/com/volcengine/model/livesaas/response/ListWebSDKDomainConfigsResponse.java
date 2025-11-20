package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.DomainConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListWebSDKDomainConfigsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListWebSDKDomainConfigsResponseBody result;

    @Data
    public static class ListWebSDKDomainConfigsResponseBody {
        @JSONField(name = "DomainConfigs")
        List<DomainConfig> DomainConfigs;
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "MaxCount")
        Long MaxCount;
        @JSONField(name = "AddedCount")
        Long AddedCount;
    }
}