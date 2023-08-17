package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetCompressTaskInfoReq {
    @JSONField(name="TaskId")
    String taskId;

    @JSONField(name="ServiceId")
    String serviceId;
}
