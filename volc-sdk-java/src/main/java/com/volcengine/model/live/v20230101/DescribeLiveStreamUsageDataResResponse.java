package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamUsageDataResResponse
 */
@lombok.Data
public final class DescribeLiveStreamUsageDataResResponse  {

    /**
     * <p>查询时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryTime")
    private String queryTime;

    /**
     * <p>请求 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    /**
     * <p>详细数据信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataInfoList")
    private List<DescribeLiveStreamUsageDataResResponseDataInfoListItem> dataInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
