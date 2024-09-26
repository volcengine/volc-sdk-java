package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCloudMixTaskResResult
 */
@lombok.Data
public final class DeleteCloudMixTaskResResult  {

    /**
     * <p>请求响应码，取值及含义如下。</p>
     *
     * <p>- `0`：请求成功；</p>
     *
     * <p>- `500`：内部处理错误；</p>
     *
     * <p>- `400`：请求异常。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private Integer code;

    /**
     * <p>请求响应码对应的信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    /**
     * <p>返回的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private String data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
