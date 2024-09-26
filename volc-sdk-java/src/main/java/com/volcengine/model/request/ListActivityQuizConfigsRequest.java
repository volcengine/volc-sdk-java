package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityQuizConfigsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "QuizType")
    Long QuizType;
    @JSONField(name = "QuizStatus")
    List<Integer> QuizStatus;
}
