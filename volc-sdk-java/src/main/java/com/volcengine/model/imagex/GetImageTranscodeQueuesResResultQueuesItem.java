package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeQueuesResResultQueuesItem
 */
@lombok.Data
public final class GetImageTranscodeQueuesResResultQueuesItem  {

    /**
     * <p>队列 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>队列名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>队列描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>队列状态。取值如下所示：</p>
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Running`：执行中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>队列类型。取值如下所示：</p>
     *
     * <p>- `default`：表示账号默认队列，每个账号一个</p>
     *
     * <p>- `user`：表示用户创建队列，个数将有配额限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>队列创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>是否启用回调，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：启用</p>
     *
     * <p>- `false`：不启用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableCallback")
    private Boolean enableCallback;

    /**
     * <p>队列回调设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private GetImageTranscodeQueuesResResultQueuesItemCallbackConf callbackConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
