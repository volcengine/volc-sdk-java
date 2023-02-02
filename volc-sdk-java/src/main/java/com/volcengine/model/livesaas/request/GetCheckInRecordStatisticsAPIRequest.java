package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetCheckInRecordStatisticsAPIRequest {
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "CheckInId")
    String CheckInId;
    @JSONField(name = "PageNo")
    Integer PageNo;
}