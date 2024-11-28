package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetLLMReportData {
    @JSONField(name = "TaskDetail")
    TaskDetail TaskDetail;
    @JSONField(name = "TaskResult")
    TaskResult TaskResult;
    @JSONField(name = "ViolationDetails")
    List<ViolationDetail> ViolationDetails;
}
