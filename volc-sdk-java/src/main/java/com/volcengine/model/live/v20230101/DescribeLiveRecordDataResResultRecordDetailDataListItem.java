package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRecordDataResResultRecordDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveRecordDataResResultRecordDetailDataListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>查询时间范围内录制峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPeak")
    private Integer recordPeak;

    /**
     * <p>录制峰值数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordDataList")
    private List<DescribeLiveRecordDataResResultRecordDetailDataListItemRecordDataListItem> recordDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
