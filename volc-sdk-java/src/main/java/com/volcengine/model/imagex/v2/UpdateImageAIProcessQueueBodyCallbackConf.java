package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAIProcessQueueBodyCallbackConf
 */
@lombok.Data
public final class UpdateImageAIProcessQueueBodyCallbackConf  {

    /**
     * <p>回调方式。仅支持取值 `HTTP`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    /**
     * <p>回调 HTTP 请求地址，用于接收批量处理结果详情。支持使用 https 和 http 协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>回调数据格式。取值如下：</p>
     *
     * <p>- `XML`</p>
     *
     * <p>- `JSON`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataFormat")
    private String dataFormat;

    /**
     * <p>业务自定义回调参数，将在回调消息的`callback_args`中透传出去。具体回调参数请参考[回调内容](https://www.volcengine.com/docs/508/1749069#%E6%AD%A5%E9%AA%A4%E4%BA%94%EF%BC%9A%E8%8E%B7%E5%8F%96%E5%A4%84%E7%90%86%E7%BB%93%E6%9E%9C%E8%AF%A6%E6%83%85)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Args")
    private String args;

    /**
     * <p>回调触发类型。取值如下：</p>
     *
     * <p>- `task`：整个任务处理完成后触发回调</p>
     *
     * <p>- `entry`：单个条目处理完成后触发回调</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
