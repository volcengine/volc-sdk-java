package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SubmitAuditRequest {

    /**
     * 项目空间名称
     */
    @JSONField(name = "ProjectName")
    private String projectName;

    /**
     * 质检任务 ID
     */
    @JSONField(name = "TaskId")
    private Long taskId;

    /**
     * 审核来源
     * LIVE: 监控台审核
     * REPORT: 报告审核
     */
    @JSONField(name = "AuditSource")
    private String auditSource;

    /**
     * 审核状态
     * APPROVED: 人审通过
     * REJECTED: 人审不通过
     */
    @JSONField(name = "AuditStatus")
    private String auditStatus;

    /**
     * 人审意见
     */
    @JSONField(name = "AuditComment")
    private String auditComment;

    /**
     * 处理建议类型
     * WARNING: 警告
     * INTERRUPTION: 断流
     */
    @JSONField(name = "OperationType")
    private String operationType;

    /**
     * 审核标注时间（相对任务开始时间的毫秒数）
     */
    @JSONField(name = "MarkTime")
    private Long markTime;
}
