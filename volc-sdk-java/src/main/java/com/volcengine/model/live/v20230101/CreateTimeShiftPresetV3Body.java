package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTimeShiftPresetV3Body
 */
@lombok.Data
public final class CreateTimeShiftPresetV3Body  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要时移的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同，默认为空表示当前应用下的所有流都进行时移。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>流名称不为空时，表示只为此条流开启时移。通过流名称配置时移时，同一个 App 最多可指定 20 路流开启时移。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>最大时移时长，即允许用户回看的最长时间，单位为秒，支持的取值如下所示。</p>
     *
     *
     *
     * <p>- `86400`：1 天；</p>
     *
     * <p>- `259200`：3 天；</p>
     *
     * <p>- `604800`：7 天；</p>
     *
     * <p>- `1296000`：15 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>时移拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>录制到 TOS 时，需配置直播流对应的拉流域名。录制到 VOD 时，需配置 VOD 的空间对应的分发域名。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullDomain")
    private String pullDomain;

    /**
     * <p>时移类型。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- `0`：录制时移，即时移复用录制配置，需提前创建对应级别的录制配置；</p>
     *
     * <p>- `1`：独立时移，即时移不复用录制配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftType")
    private Integer timeShiftType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
