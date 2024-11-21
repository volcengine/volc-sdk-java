package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageMonitorRuleBodyMonitorRule
 */
@lombok.Data
public final class UpdateImageMonitorRuleBodyMonitorRule  {

    /**
     * <p>自定义告警规则名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

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
     * <p>告警通知配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Notification")
    private UpdateImageMonitorRuleBodyMonitorRuleNotification notification;

    /**
     * <p>创建后是否立即开启告警，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enabled")
    private Boolean enabled;

    /**
     * <p>监测规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cond")
    private UpdateImageMonitorRuleBodyMonitorRuleCond cond;

    /**
     * <p>拆分维度，由[公共拆分维度](https://www.volcengine.com/docs/508/1113944)和[自定义拆分维度](https://www.volcengine.com/docs/508/34554)组合而成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>维度过滤条件，具体参数请见 [Filter](https://www.volcengine.com/docs/508/1112182#filter)。用于指定需要告警提示的维度配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filter")
    private UpdateImageMonitorRuleBodyMonitorRuleFilter filter;

    /**
     * <p>监控频率，单位为分钟。取值如下所示：</p>
     *
     *
     *
     * <p>- `5`</p>
     *
     * <p>- `10`</p>
     *
     * <p>- `20`</p>
     *
     * <p>- `30`</p>
     *
     * <p>- `40`</p>
     *
     * <p>- `50`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Frequency")
    private Integer frequency;

    /**
     * <p>监控平台，取值如下所示：</p>
     *
     *
     *
     * <p>- `iOS`</p>
     *
     * <p>- `Android`</p>
     *
     * <p>- `WEB`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    /**
     * <p>监控的应用 ID，您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Appid")
    private String appid;

    /**
     * <p>监控阶段，取值如下所示：</p>
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
     * <p>待更新的报警规则 ID，您可以调用 [GetImageMonitorRules](https://www.volcengine.com/docs/508/1112186)获取所需的告警规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
