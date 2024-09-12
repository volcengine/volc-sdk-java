package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateLLMTaskRequest {
    @JSONField(name = "TaskName")
    String TaskName;
    @JSONField(name = "TaskType")
    Integer TaskType;
    @JSONField(name = "SourceContent")
    String SourceContent;
    @JSONField(name = "LLMType")
    String LLMType;
    @JSONField(name = "CallbackURL")
    String CallbackURL;
    @JSONField(name = "Extra")
    String Extra;
}
