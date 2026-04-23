package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PublishActivityQuestionnaireRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "QuestionnaireId")
    Long QuestionnaireId;
}