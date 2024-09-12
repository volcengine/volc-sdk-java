package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ViolationDetail {
    @JSONField(name = "ViolationContent")
    String ViolationContent;
    @JSONField(name = "ViolationType")
    String ViolationType;
    @JSONField(name = "ViolationReason")
    String ViolationReason;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
}
