package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListActivityContentAnalysisRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "HistoryId")
    Long HistoryId;
    @JSONField(name = "RelativeStartTime")
    Long RelativeStartTime;
    @JSONField(name = "RelativeEndTime")
    Long RelativeEndTime;
    @JSONField(name = "Label")
    Integer Label;
    @JSONField(name = "SearchKey")
    String SearchKey;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
}
