package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainDownloadSpeedLimitBodyDownloadSpeedLimitRulesItem
 */
@lombok.Data
public final class UpdateImageDomainDownloadSpeedLimitBodyDownloadSpeedLimitRulesItem  {

    /**
     * <p>匹配类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "match_type")
    private String matchType;

    /**
     * <p>匹配值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "match_value")
    private String matchValue;

    /**
     * <p>限速配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "limit_rate")
    private Integer limitRate;

    /**
     * <p>限制速率的起始点。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "limit_rate_after")
    private Integer limitRateAfter;

    /**
     * <p>星期几。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "day_week")
    private String dayWeek;

    /**
     * <p>开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "begin_time")
    private String beginTime;

    /**
     * <p>结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "end_time")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
