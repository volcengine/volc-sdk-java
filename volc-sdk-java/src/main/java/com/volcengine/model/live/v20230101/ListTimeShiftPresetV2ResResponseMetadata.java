package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListTimeShiftPresetV2ResResponseMetadata
 */
@lombok.Data
public final class ListTimeShiftPresetV2ResResponseMetadata  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Error")
    private ListTimeShiftPresetV2ResResponseMetadataError error;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Service")
    private String service;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Version")
    private String version;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
