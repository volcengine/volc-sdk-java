package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.CallbackConfig;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListCallbackConfigsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListCallbackConfigsResponseBody result;

    @Data
    public static class ListCallbackConfigsResponseBody {
        @JSONField(name = "CallbackConfigs")
        List<CallbackConfig> CallbackConfigs;

        @JSONField(name = "TotalCount")
        Long TotalCount;
    }
}