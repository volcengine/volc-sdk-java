package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveRecordDataResResultRecordDataListItem
 */
@lombok.Data
public final class DescribeLiveRecordDataResResultRecordDataListItem {

    /**
     * <p>时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>录制峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
