package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResponseResponseMetadata
 */
@lombok.Data
public final class ResponseResponseMetadata  {

    /**
     * <p>错误信息；调用失败时返回</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Error")
    private ResponseResponseError error;

    /**
     * <p>接口名称，与具体的接口相关，表示要执行的操作</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>服务区域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>服务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Service")
    private String service;

    /**
     * <p>接口版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Version")
    private String version;

    /**
     * <p>请求 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
