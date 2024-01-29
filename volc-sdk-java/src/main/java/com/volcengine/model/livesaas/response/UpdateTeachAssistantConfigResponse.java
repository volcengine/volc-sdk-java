package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import com.volcengine.model.beans.livesaas.TeachAssistantConfig;

import java.util.List;

@Data
public class UpdateTeachAssistantConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTeachAssistantConfigResponseBody result;

    @Data
    public static class GetTeachAssistantConfigResponseBody {
        @JSONField(name = "TeachAssistantConfig")
        List<TeachAssistantConfig> TeachAssistantConfig;
    }
}