package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SpecifiableRuleArg;
import lombok.Data;

import java.util.List;

@Data
public class CreateTaskRequest {
    @JSONField(name = "ProjectName")
    String ProjectName;
    @JSONField(name = "TaskName")
    String TaskName;
    @JSONField(name = "TaskType")
    Integer TaskType;
    @JSONField(name = "ScenarioId")
    Long ScenarioId;
    @JSONField(name = "LivePullURL")
    String LivePullURL;
    @JSONField(name = "CallbackURL")
    String CallbackURL;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "TaskStartTime")
    Long TaskStartTime;
    @JSONField(name = "TagIds")
    List<Long> TagIds;
    @JSONField(name = "SpecifiableRuleArgs")
    List<SpecifiableRuleArg> SpecifiableRuleArgs;

}