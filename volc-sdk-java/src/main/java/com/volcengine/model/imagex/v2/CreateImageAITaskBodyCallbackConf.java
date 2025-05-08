package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAITaskBodyCallbackConf
 */
@lombok.Data
public final class CreateImageAITaskBodyCallbackConf  {

    /**
     * <p>回调方式，仅支持取值 `HTTP`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    /**
     * <p>回调 HTTP 请求地址，用于接收转码结果详情。支持使用 https 和 http 协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>回调数据格式，仅支持取值 `JSON`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataFormat")
    private String dataFormat;

    /**
     * <p>业务自定义回调参数，将在回调消息的 `callback_args` 中透传。具体回调参数请参考 [AI 图像处理回调](https://www.volcengine.com/docs/508/1526662)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Args")
    private String args;

    /**
     * <p>回调的维度类型，缺省情况下按照条目级别进行回调。取值如下所示：</p>
     *
     *
     *
     * <p>- `task`：将按照任务级别进行回调。可分批回调，一个批次内最多一次性可回调 5000 条图片转码条目执行信息。</p>
     *
     * <p>- `entry`：将按照条目级别进行回调。当该条目执行完毕，将立即产生回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
