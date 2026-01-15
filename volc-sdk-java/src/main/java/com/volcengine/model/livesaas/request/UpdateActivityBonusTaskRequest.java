package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.BonusObject;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityBonusTaskRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;

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
}

