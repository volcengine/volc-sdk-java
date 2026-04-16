package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetSpeechTaskResResultData
 */
@lombok.Data
public final class GetSpeechTaskResResultData  {

    /**
     * <p>任务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务状态。取值如下：</p>
     *
     * <p>- `running`：运行中。</p>
     *
     * <p>- `done`：已结束。</p>
     *
     * <p>- `prestop`：关闭中。</p>
     *
     * <p>- `init`：准备中。</p>
     *
     * <p>- `prepare`：启动中。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>任务创建时间。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatedAt")
    private String createdAt;

    /**
     * <p>任务更新时间。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdatedAt")
    private String updatedAt;

    /**
     * <p>任务结束时间。遵循 RFC3339 格式的东八区（UTC+8）时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoppedAt")
    private String stoppedAt;

    /**
     * <p>任务的规则配置，为 JSON 格式的字符串，包含任务类型、源流地址、转推地址、字幕配置等信息。具体字段说明可参考 [CreateSpeechTask](https://www.volcengine.com/docs/6469/1976224) 文档。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private String rule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
