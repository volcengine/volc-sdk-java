package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetBMReportRequest {
    @JSONField(name = "ProjectName")
    String ProjectName;
    @JSONField(name = "TaskId")
    Long TaskId;
}