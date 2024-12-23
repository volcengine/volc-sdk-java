package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateActivityAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CommonResp result;

    @Data
    public static class CommonResp {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "ViewUrl")
        String ViewUrl;
    }
}