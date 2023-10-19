package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTimeShiftDataResResultTimeShiftDataListItem
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataResResultTimeShiftDataListItem  {

    /**
     * <p>时间点，默认为每日的结束时间。例如，返回 2022-02-16T00:00:00+08:00，表示取该时刻的存储用量作为 2 月 16 日的计费用量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>存储用量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Storage")
    private Float storage;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
