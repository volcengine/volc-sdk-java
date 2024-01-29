package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentTaskDetailBody
 */
@lombok.Data
public final class GetImageContentTaskDetailBody  {

    /**
     * <p>内容管理任务类型，取值如下所示：</p>
     *
     * <p>* `refresh`：刷新任务，包含刷新 URL 和刷新目录。</p>
     *
     * <p>* `refresh_url`：刷新 URL</p>
     *
     * <p>* `block_url`：禁用 URL</p>
     *
     * <p>* `unblock_url`：解禁 URL</p>
     *
     * <p>* `preload_url`：预热 URL</p>
     *
     * <p>* `refresh_dir`：目录刷新（支持根目录刷新）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>待查询任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>内容管理资源状态，取值如下所示：</p>
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
     * <p>按时间排序，取值如下所示：</p>
     *
     * <p>- `asc`：正序</p>
     *
     * <p>- `desc`：逆序</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Order")
    private String order;

    /**
     * <p>查询开始时间，unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>查询结束时间，unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>资源 URL 或者目录，可精确匹配，取值为空时表示查询全部任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>页码，系统将仅返回该页面上的任务。默认值为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页最大记录数，取值范围是[10,1000]。默认值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
