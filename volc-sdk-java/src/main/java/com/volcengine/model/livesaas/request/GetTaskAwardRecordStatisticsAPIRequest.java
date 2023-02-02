package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetTaskAwardRecordStatisticsAPIRequest {
    @JSONField(name = "SearchType")
    Integer SearchType;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "TaskAwardItemId")
    String TaskAwardItemId;
}