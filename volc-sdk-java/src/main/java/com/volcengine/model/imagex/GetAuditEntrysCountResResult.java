package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetAuditEntrysCountResResult
 */
@lombok.Data
public final class GetAuditEntrysCountResResult  {

    /**
     * <p>累计审核图片数量，为审核成功和审核失败的图片数量之和。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    /**
     * <p>建议不通过的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NopassCount")
    private Long nopassCount;

    /**
     * <p>建议复审的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecheckCount")
    private Long recheckCount;

    /**
     * <p>审核成功的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessCount")
    private Long successCount;

    /**
     * <p>审核失败的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedCount")
    private Long failedCount;

    /**
     * <p>审核异常的图片数量，即审核失败、建议不通过和建议复审的图片数量之和。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExceptionCount")
    private Long exceptionCount;

    /**
     * <p>审核失败的审核次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditFailCount")
    private Long auditFailCount;

    /**
     * <p>审核成功的审核次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditSuccessCount")
    private Long auditSuccessCount;

    /**
     * <p>该任务的审核总次数，为审核成功和审核失败的图片数量之和。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditTotal")
    private Long auditTotal;

    /**
     * <p>异常审核的总次数，即审核失败、建议不通过和建议复审的审核次数之和。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditExceptionCount")
    private Long auditExceptionCount;

    /**
     * <p>建议不通过的审核次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditNopassCount")
    private Long auditNopassCount;

    /**
     * <p>建议复审的审核次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditRecheckCount")
    private Long auditRecheckCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
