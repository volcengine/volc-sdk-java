package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetMergedReportRequest {
    @JSONField(name = "TaskIds")
    List<Long> TaskIds;
}