package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageAnalyzeTaskRunBody
 */
@lombok.Data
public final class DeleteImageAnalyzeTaskRunBody  {

    /**
     * <p>待删除执行记录的任务 ID，您可以通过调用 [GetImageAnalyzeTasks](https://www.volcengine.com/docs/508/1160417) 获取指定地区全部离线评估任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>执行 ID，您可以通过调用 [GetImageAnalyzeResult](https://www.volcengine.com/docs/508/1160419) 获取该任务全部的执行记录查看执行 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunId")
    private String runId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
