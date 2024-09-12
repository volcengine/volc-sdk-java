package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetLLMReportRequest {
    @JSONField(name = "TaskId")
    String TaskId;
}
