package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageTranscodeQueueBody
 */
@lombok.Data
public final class UpdateImageTranscodeQueueBody  {

    /**
     * <p>待更新的队列 ID，您可通过调用[GetImageTranscodeQueues](https://www.volcengine.com/docs/508/1107341)获取该账号下全部任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>更新后的队列名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>更新后的队列描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>是否启用回调。取值如下所示：</p>
     *
     * <p>- `true`：启用</p>
     *
     * <p>- `false`：不启用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableCallback")
    private Boolean enableCallback;

    /**
     * <p>更新后的队列回调配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private UpdateImageTranscodeQueueBodyCallbackConf callbackConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
