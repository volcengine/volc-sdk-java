package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CopyActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CopyActivityQuestionnaireResponseBody result;

    @Data
    public static class CopyActivityQuestionnaireResponseBody {
        @JSONField(name = "Id")
        Long Id;
    }
}