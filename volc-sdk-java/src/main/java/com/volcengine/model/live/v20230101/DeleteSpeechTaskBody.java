package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteSpeechTaskBody
 */
@lombok.Data
public final class DeleteSpeechTaskBody  {

    /**
     * <p>任务 ID。可通过调用 [CreateSpeechTask](https://www.volcengine.com/docs/6469/1976224) 或 [SearchSpeechTask](https://www.volcengine.com/docs/6469/1978522) 获取 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>是否同步删除记录。默认值为 `false`。取值如下：</p>
     *
     * <p>- `true`：删除记录，之后无法通过 [SearchSpeechTask](https://www.volcengine.com/docs/6469/1978522) 接口搜索到该任务。</p>
     *
     * <p>- `false`：保留记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WithRecord")
    private Boolean withRecord;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
