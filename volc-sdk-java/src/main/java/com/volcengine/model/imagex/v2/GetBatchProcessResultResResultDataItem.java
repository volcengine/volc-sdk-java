package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetBatchProcessResultResResultDataItem
 */
@lombok.Data
public final class GetBatchProcessResultResResultDataItem  {

    /**
     * <p>资源 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>该资源的文件大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>该资源执行批处理操作时的错误描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Err")
    private String err;

    /**
     * <p>访问该资源时返回的 [HTTP 状态码](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Integer statusCode;

    /**
     * <p>该资源使用的批处理能力</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
