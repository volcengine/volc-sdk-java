package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTimeShiftDataResResult
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataResResult  {

    /**
     * <p>域名空间列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhosts")
    private List<String> vhosts;

    /**
     * <p>开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>时移存储数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftDataList")
    private List<DescribeLiveTimeShiftDataResResultTimeShiftDataListItem> timeShiftDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
