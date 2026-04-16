package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamGroupByPageRes
 */
@lombok.Data
public final class DescribeForbiddenStreamGroupByPageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeForbiddenStreamGroupByPageResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeForbiddenStreamGroupByPageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
