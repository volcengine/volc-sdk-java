package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RestartSpeechTaskBody
 */
@lombok.Data
public final class RestartSpeechTaskBody  {

    /**
     * <p>任务 ID。可通过调用 [CreateSpeechTask](https://www.volcengine.com/docs/6469/1976224) 或 [SearchSpeechTask](https://www.volcengine.com/docs/6469/1978522) 获取 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
