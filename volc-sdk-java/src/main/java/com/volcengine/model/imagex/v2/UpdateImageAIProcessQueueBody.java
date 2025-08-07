package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAIProcessQueueBody
 */
@lombok.Data
public final class UpdateImageAIProcessQueueBody  {

    /**
     * <p>任务队列 ID。您可通过调用 [GetImageAIProcessQueues](https://www.volcengine.com/docs/508/1755529) 获取该账号下全部任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>任务队列名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务队列描述，可用于备注该队列的用途。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>任务队列是否开启回调配置，取值如下：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableCallback")
    private Boolean enableCallback;

    /**
     * <p>任务队列回调设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private UpdateImageAIProcessQueueBodyCallbackConf callbackConf;

    /**
     * <p>任务队列属性。取值如下：</p>
     *
     * <p>- `ai_super_resolution`：AIGC 大模型超分辨率</p>
     *
     * <p>- `bgfill`：智能图像扩展</p>
     *
     * <p>- `super_resolution`：图像超分辨率（云端）</p>
     *
     * <p>- `InfiniteCreations`：电商万创</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Attribute")
    private String attribute;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
