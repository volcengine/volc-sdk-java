package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItemStatusDataListItemStatusSummaryDataListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItemStatusDataListItemStatusSummaryDataListItem  {

    /**
     * <p>状态码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Integer statusCode;

    /**
     * <p>出现次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    /**
     * <p>占比</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Percent")
    private Float percent;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
