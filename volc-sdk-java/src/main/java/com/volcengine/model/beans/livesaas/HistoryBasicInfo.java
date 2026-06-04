package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HistoryBasicInfo {
    @JSONField(name = "HistoryId")
    Long HistoryId;
    @JSONField(name = "OrderNumber")
    Integer OrderNumber;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Vid")
    String Vid;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "CoverImage")
    String CoverImage;
    @JSONField(name = "TotalGrade")
    String TotalGrade;
    @JSONField(name = "ErrorMessage")
    String ErrorMessage;
}
