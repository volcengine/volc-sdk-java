package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetContentSecurityStatisticsRequest {
    @JSONField(name = "AppId")
    private Long appId;
    @JSONField(name = "Scene")
    private String scene;
    @JSONField(name = "LabelsType")
    private String labelsType;
    @JSONField(name = "StartTime")
    private Long startTime;
    @JSONField(name = "EndTime")
    private Long endTime;
}
