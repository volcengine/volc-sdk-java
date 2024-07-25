package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailAppRes
 */
@lombok.Data
public final class DetailAppRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DetailAppResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
