package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateScriptPreReviewRequest {
    @JSONField(name = "ProjectName")
    private String projectName;
    @JSONField(name = "TaskName")
    private String taskName;
    @JSONField(name = "ScenarioId")
    private Long scenarioId;
    @JSONField(name = "Content")
    private String content;
    @JSONField(name = "CallbackURL")
    private String callbackURL;
    @JSONField(name = "Extra")
    private String extra;
    @JSONField(name = "TagIds")
    private List<Long> tagIds;
}
