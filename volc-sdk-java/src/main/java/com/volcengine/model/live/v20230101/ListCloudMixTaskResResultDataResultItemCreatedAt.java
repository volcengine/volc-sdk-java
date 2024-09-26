package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCloudMixTaskResResultDataResultItemCreatedAt
 */
@lombok.Data
public final class ListCloudMixTaskResResultDataResultItemCreatedAt  {

    /**
     * <p>时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
