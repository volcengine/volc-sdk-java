package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UpdateProductResourceRes
 */
@lombok.Data
public final class UpdateProductResourceRes  {

    /**
     * <p>公共返回参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>Result 字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private String result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
