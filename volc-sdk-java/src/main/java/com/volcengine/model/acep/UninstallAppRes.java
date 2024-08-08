package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UninstallAppRes
 */
@lombok.Data
public final class UninstallAppRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UninstallAppResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
