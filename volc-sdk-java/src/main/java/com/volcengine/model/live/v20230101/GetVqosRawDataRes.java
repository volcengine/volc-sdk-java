package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetVqosRawDataRes
 */
@lombok.Data
public final class GetVqosRawDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetVqosRawDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetVqosRawDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
