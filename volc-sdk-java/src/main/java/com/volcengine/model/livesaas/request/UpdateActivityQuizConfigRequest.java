package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuizOption;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityQuizConfigRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "QuizTitle")
    String QuizTitle;
    @JSONField(name = "QuizResultType")
    Integer QuizResultType;
    @JSONField(name = "QuizOptions")
    List<QuizOption> QuizOptions;
    @JSONField(name = "RightOptions")
    List<String> RightOptions;
    @JSONField(name = "Deadline")
    Long Deadline;
    @JSONField(name = "QuizTitleType")
    Integer QuizTitleType;
    @JSONField(name = "QuizAnalysis")
    String QuizAnalysis;
    @JSONField(name = "QuizType")
    Long QuizType;
}
