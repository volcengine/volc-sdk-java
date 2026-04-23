package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class QuestionnaireUpdateAPI {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "Title")
    String Title;
    @JSONField(name = "Description")
    String Description;
    @JSONField(name = "TriggerTime")
    String TriggerTime;
    @JSONField(name = "SendTime")
    Long SendTime;
    @JSONField(name = "IsRealNameEnable")
    Integer IsRealNameEnable;
    @JSONField(name = "Questions")
    List<QuestionAPI> Questions;
}