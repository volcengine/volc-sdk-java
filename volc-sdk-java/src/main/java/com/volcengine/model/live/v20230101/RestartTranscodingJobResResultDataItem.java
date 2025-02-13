package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RestartTranscodingJobResResultDataItem
 */
@lombok.Data
public final class RestartTranscodingJobResResultDataItem  {

    /**
     * <p>开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
