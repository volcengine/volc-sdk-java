package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMigrateTasksQuery
 */
@lombok.Data
public final class GetImageMigrateTasksQuery  {

    /**
     * <p>任务地区（即任务目标服务的地区），缺省时将返回国内列表。取值如下所示：</p>
     *
     *
     *
     * <p>- `cn`：国内</p>
     *
     * <p>- `va`：美东</p>
     *
     * <p>- `sg`：新加坡</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>迁移的目标服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>分页偏移量。默认值为 0，表示从最新一个开始获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页条数。默认值为 10，最大值为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>返回任务名称中包含该值的迁移任务信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskNamePtn")
    private String taskNamePtn;

    /**
     * <p>任务状态，填入多个时使用半角逗号分隔。取值如下所示：</p>
     *
     * <p>- `Initial`：创建中</p>
     *
     * <p>- `Running`：运行中</p>
     *
     * <p>- `Done`：全部迁移完成</p>
     *
     * <p>- `Partial`：部分迁移完成</p>
     *
     * <p>- `Failed`：迁移失败</p>
     *
     * <p>- `Terminated`：中止</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
