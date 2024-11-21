package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAlertRecordsResResultAlertRecordsItem
 */
@lombok.Data
public final class GetImageAlertRecordsResResultAlertRecordsItem  {

    /**
     * <p>告警规则 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    /**
     * <p>告警规则名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>告警阶段，取值如下所示：</p>
     *
     *
     *
     * <p>- `upload`：图片上传-上传 1.0</p>
     *
     * <p>- `uploadv2`：图片上传-上传 2.0</p>
     *
     * <p>- `cdn`：图片加载-下行网络监控</p>
     *
     * <p>- `client`：图片加载-客户端传状态监控</p>
     *
     * <p>- `sensible`：图片加载-感知指标监控</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private String phase;

    /**
     * <p>告警平台</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    /**
     * <p>告警级别，取值如下所示：</p>
     *
     *
     *
     * <p>- `warn`：警告</p>
     *
     * <p>- `error`：错误</p>
     *
     * <p>- `fatal`：致命</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Level")
    private String level;

    /**
     * <p>告警时间。日期格式按照 `ISO8601` 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlertAt")
    private String alertAt;

    /**
     * <p>告警条件</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlertCond")
    private GetImageAlertRecordsResResultAlertRecordsItemAlertCond alertCond;

    /**
     * <p>记录标识，用于获取下一页数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
