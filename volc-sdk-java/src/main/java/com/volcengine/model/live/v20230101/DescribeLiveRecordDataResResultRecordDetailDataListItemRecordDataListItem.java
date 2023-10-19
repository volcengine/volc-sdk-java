package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveRecordDataResResultRecordDetailDataListItemRecordDataListItem
 */
@lombok.Data
public final class DescribeLiveRecordDataResResultRecordDetailDataListItemRecordDataListItem  {

    /**
     * <p>时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>录制峰值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
