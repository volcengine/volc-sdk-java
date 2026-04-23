package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class UpdateActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateActivityQuestionnaireResponseBody result;

    @Data
    public static class UpdateActivityQuestionnaireResponseBody {
        @JSONField(name = "Id")
        Long Id;
    }
}