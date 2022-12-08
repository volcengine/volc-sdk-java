package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AnalysisUserBehaviorPeopleRequest {
    @JSONField(name = "TotalTime")
    Long TotalTime;
    @JSONField(name = "Source")
    Integer Source;
    @JSONField(name = "IsMerge")
    Integer IsMerge;
    @JSONField(name = "IsMergeUserId")
    Integer IsMergeUserId;
    @JSONField(name = "ActivityID")
    Long ActivityID;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "Percentage")
    Long Percentage;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "PlayStatus")
    Integer PlayStatus;
    @JSONField(name = "EndTime")
    Long EndTime;
}