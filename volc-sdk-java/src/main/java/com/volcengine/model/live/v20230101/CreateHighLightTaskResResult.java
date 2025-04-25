package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskResResult
 */
@lombok.Data
public final class CreateHighLightTaskResResult  {

    /**
     * <p>参数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private CreateHighLightTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
