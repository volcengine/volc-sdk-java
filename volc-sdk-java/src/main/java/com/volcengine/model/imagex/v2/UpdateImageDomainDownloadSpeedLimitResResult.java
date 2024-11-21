package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainDownloadSpeedLimitResResult
 */
@lombok.Data
public final class UpdateImageDomainDownloadSpeedLimitResResult  {

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
