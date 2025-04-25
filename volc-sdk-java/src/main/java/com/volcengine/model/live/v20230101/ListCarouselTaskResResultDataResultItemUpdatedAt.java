package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCarouselTaskResResultDataResultItemUpdatedAt
 */
@lombok.Data
public final class ListCarouselTaskResResultDataResultItemUpdatedAt  {

    /**
     * <p>任务的更新时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
