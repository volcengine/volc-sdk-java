package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamSessionDataResResultSessionDetailDataListItemSessionDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResultSessionDetailDataListItemSessionDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 时间，例如，2022-04-13T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>请求数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Request")
    private Integer request;

    /**
     * <p>在线人数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineUser")
    private Integer onlineUser;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
