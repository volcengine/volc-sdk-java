package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRecordDataResResultRecordDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveRecordDataResResultRecordDetailDataListItem  {

    /**
     * <p>按域名维度进行数据拆分时的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>按维度进行数据拆分后，当前维度的录制并发路数最大值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPeak")
    private Integer recordPeak;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordDataList")
    private List<DescribeLiveRecordDataResResultRecordDetailDataListItemRecordDataListItem> recordDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
