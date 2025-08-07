package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAIProcessQueueBody
 */
@lombok.Data
public final class CreateImageAIProcessQueueBody  {

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
     * <p>是否启动队列，开始执行批量处理操作。取值如下：</p>
     *
     * <p>- `true`：启动</p>
     *
     * <p>- `false`：不启动</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsStart")
    private Boolean isStart;

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

    /**
     * <p>任务队列回调设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private CreateImageAIProcessQueueBodyCallbackConf callbackConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
