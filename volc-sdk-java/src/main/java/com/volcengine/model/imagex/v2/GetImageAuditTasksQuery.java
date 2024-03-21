package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAuditTasksQuery
 */
@lombok.Data
public final class GetImageAuditTasksQuery  {

    /**
     * <p>任务地区。仅支持默认取值 `cn`，表示国内。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>审核场景，缺省情况下查询全部场景的任务。取值如下所示：</p>
     *
     *
     *
     * <p>- `UrlFile`：上传 txt 审核文件处理场景</p>
     *
     * <p>- `Url`：上传审核图片 URL 处理场景</p>
     *
     * <p>- `Upload`：图片上传场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>审核能力，缺省情况下查询全部审核类型的任务。取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：基础审核能力</p>
     *
     * <p>- `1`：智能审核能力</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditAbility")
    private Integer auditAbility;

    /**
     * <p>审核状态，缺省情况下查询全部状态的任务。取值如下所示：</p>
     *
     *
     *
     * <p>- `Running`：审核中</p>
     *
     * <p>- `Suspend`：已暂停</p>
     *
     * <p>- `Done`：已完成</p>
     *
     * <p>- `Failed`：审核失败</p>
     *
     * <p>- `Cancel`：已取消</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>审核任务类型，当前仅支持取值为 `audit`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>分页条数。取值范围为 (0,100]，默认值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移量，默认为 0。取值为 1 时，表示跳过第一条数据，从第二条数据取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
