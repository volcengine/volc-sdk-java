package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAlertRecordsBody
 */
@lombok.Data
public final class GetImageAlertRecordsBody  {

    /**
     * <p>告警名称，正则匹配。不填则查询所有告警记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>告警规则 ID，完全匹配。不填则查询所有告警记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    /**
     * <p>应用 ID。您可以通过调用 [GetImageXQueryApps](https://www.volcengine.com/docs/508/19511) 的方式获取账号下全部的 AppId。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>获取数据起始时间点。日期格式按照 `ISO8601` 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如 `2019-06-02T00:00:00+08:00`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>由于仅支持查询近 90 天的历史数据，则若此刻时间为`2011-11-21T16:14:00+08:00`，那么您可输入最早的开始时间为`2011-08-18T00:00:00+08:00`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点，需在起始时间点之后。日期格式按照 `ISO8601` 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如 `2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>获取个数限制。默认值为 10，取值范围为 (0,100\]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移量。默认值为 0，表示从最新一个开始获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
