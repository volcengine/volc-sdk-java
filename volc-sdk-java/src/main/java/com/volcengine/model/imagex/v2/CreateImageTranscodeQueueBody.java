package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTranscodeQueueBody
 */
@lombok.Data
public final class CreateImageTranscodeQueueBody  {

    /**
     * <p>自定义任务队列名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>自定义任务队列描述，可用于备注该队列的用途。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>是否启动队列，开始执行离线转码操作。取值如下所示：</p>
     *
     * <p>- `true`：启动</p>
     *
     * <p>- `false`：不启动</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsStart")
    private Boolean isStart;

    /**
     * <p>队列区域。默认当前区域。ToB支持取值：cn、va、sg。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>队列回调设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private CreateImageTranscodeQueueBodyCallbackConf callbackConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
