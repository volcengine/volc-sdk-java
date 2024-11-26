package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListTaskResult {
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "Decision")
    String Decision;
    @JSONField(name = "ViolationCount")
    Integer ViolationCount;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Cost")
    Integer Cost;
}