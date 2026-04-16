package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSpeechTaskBody
 */
@lombok.Data
public final class UpdateSpeechTaskBody  {

    /**
     * <p>任务 ID。可通过调用 [CreateSpeechTask](https://www.volcengine.com/docs/6469/1976224) 或 [SearchSpeechTask](https://www.volcengine.com/docs/6469/1978522) 获取 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>开关状态。取值如下：</p>
     *
     * <p>- `AllDisable`：同时关闭当前模式下的所有功能。</p>
     *
     * <p>- `AllEnable`：同时开启当前模式下的所有功能，但不会开启[创建声影同传任务](https://www.volcengine.com/docs/6469/1976224)时未开启的功能。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Switch")
    private String mySwitch;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
