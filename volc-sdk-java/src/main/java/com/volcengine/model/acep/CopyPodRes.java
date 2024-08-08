package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CopyPodRes
 */
@lombok.Data
public final class CopyPodRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CopyPodResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
