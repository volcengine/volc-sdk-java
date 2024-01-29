package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageTranscodeQueueBodyCallbackConf
 */
@lombok.Data
public final class UpdateImageTranscodeQueueBodyCallbackConf  {

    /**
     * <p>回调方式。仅支持取值 `HTTP`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    /**
     * <p>回调 HTTP 请求地址，用于接收转码结果详情。支持使用 https 和 http 协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>回调数据格式。取值如下所示：</p>
     *
     * <p>- `XML`</p>
     *
     * <p>- `JSON`（默认）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataFormat")
    private String dataFormat;

    /**
     * <p>业务自定义回调参数，将在回调消息的`callback_args`中透传出去。具体回调参数请参考[回调内容](https://www.volcengine.com/docs/508/1104726#%E5%9B%9E%E8%B0%83%E5%86%85%E5%AE%B9)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Args")
    private String args;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
