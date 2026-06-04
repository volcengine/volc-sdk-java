package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListActivityLiveAnalysisHistoriesRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "LiveStartTime")
    Long LiveStartTime;
    @JSONField(name = "LiveEndTime")
    Long LiveEndTime;
    @JSONField(name = "TotalGrade")
    String TotalGrade;
}
