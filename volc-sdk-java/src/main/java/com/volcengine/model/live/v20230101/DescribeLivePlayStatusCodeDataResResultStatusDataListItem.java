package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResultStatusDataListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultStatusDataListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内的状态码详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusSummaryDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDataListItemStatusSummaryDataListItem> statusSummaryDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
