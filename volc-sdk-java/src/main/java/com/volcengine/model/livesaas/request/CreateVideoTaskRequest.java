package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SpecifiableRuleArg;
import com.volcengine.model.beans.livesaas.VideoTaskItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateVideoTaskRequest {
    @JSONField(name = "ProjectName")
    String ProjectName;
    @JSONField(name = "TaskName")
    String TaskName;
    @JSONField(name = "ScenarioId")
    Long ScenarioId;
    @JSONField(name = "SourceType")
    Integer SourceType;
    @JSONField(name = "TaskItems")
    List<VideoTaskItem> TaskItems;
    @JSONField(name = "CallbackURL")
    String CallbackURL;
    @JSONField(name = "Extra")
    String Extra;
    @JSONField(name = "TagIds")
    List<Long> TagIds;
    @JSONField(name = "SpecifiableRuleArgs")
    List<SpecifiableRuleArg> SpecifiableRuleArgs;
}
