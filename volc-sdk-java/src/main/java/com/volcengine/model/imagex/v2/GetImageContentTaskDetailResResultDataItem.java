package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentTaskDetailResResultDataItem
 */
@lombok.Data
public final class GetImageContentTaskDetailResResultDataItem  {

    /**
     * <p>任务指定的 URL 或目录</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>资源任务类型，取值如下所示：</p>
     *
     * <p>* `refresh`：刷新任务</p>
     *
     * <p>* `refresh_url`：刷新 URL</p>
     *
     * <p>* `block_url`：禁用 URL</p>
     *
     * <p>* `unblock_url`：解禁 URL</p>
     *
     * <p>* `preload_url`：预热 URL</p>
     *
     * <p>* `refresh_dir`：目录刷新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>资源任务状态，取值如下所示：</p>
     *
     * <p>- `submitting`：提交中</p>
     *
     * <p>- `running`：执行中</p>
     *
     * <p>- `succeed`：成功</p>
     *
     * <p>- `failed`：失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "State")
    private String state;

    /**
     * <p>任务进度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Process")
    private String process;

    /**
     * <p>任务的创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    /**
     * <p>任务的更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private Long updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
