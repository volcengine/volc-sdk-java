package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class AwardCondition {
    @JSONField(name = "CheckIn")
    String CheckIn;
    @JSONField(name = "Vote")
    String Vote;
    @JSONField(name = "RightQuiz")
    String RightQuiz;
    @JSONField(name = "Quiz")
    String Quiz;
    @JSONField(name = "Questionnaire")
    String Questionnaire;
}
