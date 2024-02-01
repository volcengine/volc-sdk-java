package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetBatchTaskInfoReq {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "TaskId")
    String taskId;
}
