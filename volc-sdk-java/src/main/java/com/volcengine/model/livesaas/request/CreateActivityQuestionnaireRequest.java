package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuestionnaireCreateAPI;
import lombok.Data;

@Data
public class CreateActivityQuestionnaireRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Questionnaire")
    QuestionnaireCreateAPI Questionnaire;
}