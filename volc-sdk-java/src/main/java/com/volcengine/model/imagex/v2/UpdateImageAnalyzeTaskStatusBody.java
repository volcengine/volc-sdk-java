package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAnalyzeTaskStatusBody
 */
@lombok.Data
public final class UpdateImageAnalyzeTaskStatusBody  {

    /**
     * <p>待更新的任务 ID，您可以通过调用 [GetImageAnalyzeTasks](https://www.volcengine.com/docs/508/1160417) 获取指定地区全部离线评估任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>更新后的任务状态。取值如下所示：</p>
     *
     * <p>- `Running`：进行中</p>
     *
     * <p>- `Suspend`：暂停</p>
     *
     * <p>- `Done`：结束</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
