package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ActivityBonusTask {
    @JSONField(name = "Id")
    Long Id;

    @JSONField(name = "Name")
    String Name;

    @JSONField(name = "StartTime")
    Long StartTime;

    @JSONField(name = "EndTime")
    Long EndTime;

    @JSONField(name = "TaskRunningType")
    Integer TaskRunningType;

    @JSONField(name = "BonusList")
    List<BonusObject> BonusList;

    @JSONField(name = "Status")
    Integer Status;

    @JSONField(name = "ActualStartTime")
    Long ActualStartTime;

    @JSONField(name = "ActualEndTime")
    Long ActualEndTime;
}

