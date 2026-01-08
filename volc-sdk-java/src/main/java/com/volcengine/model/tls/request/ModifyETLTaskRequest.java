package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ModifyETLTaskRequest {
    @JSONField(name = "TaskId")
    private String taskId;

    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Description")
    private String description;

    @JSONField(name = "Script")
    private String script;

    @JSONField(name = "TargetResources")
    private List<TargetResource> targetResources;

    public boolean CheckValidation() {
        return this.taskId != null && !this.taskId.isEmpty();
    }
}
