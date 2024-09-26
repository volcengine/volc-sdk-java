package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCloudMixTaskResResultDataResultItemStoppedAt
 */
@lombok.Data
public final class ListCloudMixTaskResResultDataResultItemStoppedAt  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
