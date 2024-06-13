package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.BusinessAccountInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetBusinessAccountInfoResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetBusinessAccountInfoResponseBody result;

    @Data
    public static class GetBusinessAccountInfoResponseBody {
        @JSONField(name = "IsBusinessAccountEnable")
        Integer IsBusinessAccountEnable;
        @JSONField(name = "BusinessAccountInfo")
        BusinessAccountInfo BusinessAccountInfo;
    }
}
