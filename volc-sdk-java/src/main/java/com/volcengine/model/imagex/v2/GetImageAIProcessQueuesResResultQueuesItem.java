package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAIProcessQueuesResResultQueuesItem
 */
@lombok.Data
public final class GetImageAIProcessQueuesResResultQueuesItem  {

    /**
     * <p>任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>任务队列名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务队列描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>任务队列状态。取值如下：</p>
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Running`：执行中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>任务队列类型。取值如下：</p>
     *
     * <p>- `default`：表示账号默认队列，每个账号一个</p>
     *
     * <p>- `user`：表示用户创建队列，个数将有配额限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>任务队列的创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

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
    private GetImageAIProcessQueuesResResultQueuesItemCallbackConf callbackConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
