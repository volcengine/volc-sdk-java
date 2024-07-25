package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * RenewResourceAutoRes
 */
@lombok.Data
public final class RenewResourceAutoRes  {

    /**
     * <p>公共返回参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>Result 字段， 订单ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private String result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
