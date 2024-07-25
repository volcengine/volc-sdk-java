package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * PowerOnPodRes
 */
@lombok.Data
public final class PowerOnPodRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private PowerOnPodResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
