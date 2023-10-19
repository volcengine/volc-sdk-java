package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItemStatusDataListItem
 */
@lombok.Data
public final class DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItemStatusDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>按状态码区分的数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusSummaryDataList")
    private List<DescribeLivePlayStatusCodeDataResResultStatusDetailDataListItemStatusDataListItemStatusSummaryDataListItem> statusSummaryDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
