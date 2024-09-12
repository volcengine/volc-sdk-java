package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TaskDetail {
    @JSONField(name = "TaskId")
    String TaskId;
    @JSONField(name = "TaskName")
    String TaskName;
    @JSONField(name = "TaskType")
    Integer TaskType;
    @JSONField(name = "SourceContent")
    String SourceContent;
    @JSONField(name = "LLMType")
    String LLMType;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "CallbackURL")
    String CallbackURL;
}
