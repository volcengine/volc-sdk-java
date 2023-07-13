package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageTranscodeTaskResp {
    @JSONField(name = "TaskId")
    String taskId;
}
