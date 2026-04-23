package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateActivityQuestionnaireResponseBody result;

    @Data
    public static class CreateActivityQuestionnaireResponseBody {
        @JSONField(name = "Id")
        Long Id;
    }
}