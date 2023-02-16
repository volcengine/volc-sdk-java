package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class AnalysisUserBehaviorPeopleV2Request {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PlayStatus")
    Integer PlayStatus;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "Percentage")
    Long Percentage;
    @JSONField(name = "TotalTime")
    Long TotalTime;
    @JSONField(name = "IsMerge")
    Integer IsMerge;
    @JSONField(name = "IsMergeUserId")
    Integer IsMergeUserId;
    @JSONField(name = "Channel")
    String Channel;
}