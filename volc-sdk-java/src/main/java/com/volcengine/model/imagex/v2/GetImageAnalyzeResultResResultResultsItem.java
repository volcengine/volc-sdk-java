package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAnalyzeResultResResultResultsItem
 */
@lombok.Data
public final class GetImageAnalyzeResultResResultResultsItem  {

    /**
     * <p>任务指定 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunId")
    private String runId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartAt")
    private String startAt;

    /**
     * <p>任务状态，取值如下所示：</p>
     *
     * <p>- `Running`：进行中</p>
     *
     * <p>- `Suspend`：暂停</p>
     *
     * <p>- `Done`：结束</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>评估结果存储 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResultUri")
    private String resultUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
