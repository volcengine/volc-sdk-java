package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class LLMTask {
    @JSONField(name = "TaskDetail")
    TaskDetail TaskDetail;
    @JSONField(name = "TaskResult")
    TaskResult TaskResult;
}
