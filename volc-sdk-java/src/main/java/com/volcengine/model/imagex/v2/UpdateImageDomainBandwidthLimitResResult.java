package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainBandwidthLimitResResult
 */
@lombok.Data
public final class UpdateImageDomainBandwidthLimitResResult  {

    /**
     * <p>通知描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "msg")
    private String msg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
