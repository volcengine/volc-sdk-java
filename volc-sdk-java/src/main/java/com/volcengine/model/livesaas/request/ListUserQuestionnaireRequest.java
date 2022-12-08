package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListUserQuestionnaireRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "QuestionnaireId")
    Long QuestionnaireId;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "Source")
    Integer Source;
}