package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetLiveAnalysisReportOverviewRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "HistoryId")
    Long HistoryId;
    @JSONField(name = "Token")
    String Token;
}
