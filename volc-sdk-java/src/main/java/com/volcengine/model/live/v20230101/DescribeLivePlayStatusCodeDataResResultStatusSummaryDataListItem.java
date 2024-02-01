package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePlayStatusCodeDataResResultStatusSummaryDataListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultStatusSummaryDataListItem  {

    /**
     * <p>请求的状态码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Integer statusCode;

    /**
     * <p>当前状态码出现的次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    /**
     * <p>当前状态码出现次数在总状态码次数中的占比。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Percent")
    private Float percent;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
