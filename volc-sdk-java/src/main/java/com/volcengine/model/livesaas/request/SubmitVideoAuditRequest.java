package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SubmitVideoAuditRequest {
    @JSONField(name = "ProjectName")
    private String projectName;
    @JSONField(name = "TaskId")
    private Long taskId;
    @JSONField(name = "AuditStatus")
    private String auditStatus;
    @JSONField(name = "AuditComment")
    private String auditComment;
}
