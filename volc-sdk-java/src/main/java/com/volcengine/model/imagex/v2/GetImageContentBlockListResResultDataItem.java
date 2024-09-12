package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentBlockListResResultDataItem
 */
@lombok.Data
public final class GetImageContentBlockListResResultDataItem  {

    /**
     * <p>指定的 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>URL 状态</p>
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
     * <p>完成结果提示信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Msg")
    private String msg;

    /**
     * <p>任务类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `block_url`：禁用任务。</p>
     *
     * <p>- `unblock_url`：解禁任务，表示此时解禁未完成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

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
