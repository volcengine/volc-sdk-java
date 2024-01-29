package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientTopFileSizeResResponseMetadata
 */
@lombok.Data
public final class DescribeImageXClientTopFileSizeResResponseMetadata  {

    /**
     * <p>RequestID为每次API请求的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    /**
     * <p>请求的接口名，属于请求的公共参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>请求的版本号，属于请求的公共参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Version")
    private String version;

    /**
     * <p>请求的服务，属于请求的公共参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Service")
    private String service;

    /**
     * <p>请求的Region，例如：cn-north-1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
