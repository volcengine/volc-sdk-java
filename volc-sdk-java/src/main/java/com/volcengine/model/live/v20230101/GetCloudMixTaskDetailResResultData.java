package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCloudMixTaskDetailResResultData
 */
@lombok.Data
public final class GetCloudMixTaskDetailResResultData  {

    /**
     * <p>任务最近一次更新的版本标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastOperationIndex")
    private Integer lastOperationIndex;

    /**
     * <p>任务最近一次成功更新的版本标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LastSuccessOperationIndex")
    private Integer lastSuccessOperationIndex;

    /**
     * <p>混流任务详细配置的 Json 字符串。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private String rule;

    /**
     * <p>混流任务状态，取值及含义如下所示。</p>
     *
     * <p>- `pending`：任务调度被阻塞。</p>
     *
     * <p>- `prepare`：正在准备任务资源。</p>
     *
     * <p>- `runing`：任务进行中。</p>
     *
     * <p>- `prestop`：正在清理任务资源。</p>
     *
     * <p>- `done`：任务已结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>混流任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
