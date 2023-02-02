package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class UpdateAccountTemplateStatusAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateAccountTemplateStatusAPIResponseBody result;

    @Data
    public static class UpdateAccountTemplateStatusAPIResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}