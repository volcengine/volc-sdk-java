package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class QuestionAPI {
    @JSONField(name = "Question")
    String Question;
    @JSONField(name = "IsRequire")
    Integer IsRequire;
    @JSONField(name = "QuestionTag")
    String QuestionTag;
    @JSONField(name = "QuestionSubTag")
    String QuestionSubTag;
    @JSONField(name = "Options")
    List<OptionAPI> Options;
}