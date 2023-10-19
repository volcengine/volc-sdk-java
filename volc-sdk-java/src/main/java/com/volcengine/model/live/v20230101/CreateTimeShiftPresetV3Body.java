package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTimeShiftPresetV3Body
 */
@lombok.Data
public final class CreateTimeShiftPresetV3Body  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>开启时移的流名称，同一个 App 最多可指定 20 路。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>最大时移时长，即观看时移的最长时间，单位为 s。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- 86400</p>
     *
     * <p>- 259200</p>
     *
     * <p>- 604800</p>
     *
     * <p>- 1296000</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>时移拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullDomain")
    private String pullDomain;

    /**
     * <p>时移类型。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- 0：录制时移，即时移复用录制模板；</p>
     *
     * <p>- 1：独立时移，即时移不复用录制模板。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftType")
    private Integer timeShiftType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
