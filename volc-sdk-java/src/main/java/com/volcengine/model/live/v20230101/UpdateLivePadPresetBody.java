package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateLivePadPresetBody
 */
@lombok.Data
public final class UpdateLivePadPresetBody  {

    /**
     * <p>待更新的垫片模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>垫片模板的描述信息，用于详细说明该模板的用途或特性，最大长度为 `1024` 字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>垫片类型，取值及含义如下所示。</p>
     *
     * <p>- `1`：图片；</p>
     *
     * <p>- `2`：视频；</p>
     *
     * <p>- `3`：源流最后一帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PadType")
    private Integer padType;

    /**
     * <p>断流等待时间，即直播断流后等待播放垫片的时长，单位为毫秒，取值范围为 `[0,6000]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitDuration")
    private Long waitDuration;

    /**
     * <p>垫片最大播放时长，单位为毫秒，取值范围为 `[1000,1000000000]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxDuration")
    private Long maxDuration;

    /**
     * <p>垫片素材的地址，用于指定垫片播放时使用的图片或视频资源。</p>
     *
     * <p>- 当  `PadType = 1`（图片）或 `PadType =2`（视频）时**有效**；</p>
     *
     * <p>- 当 `PadType = 3`（源流最后一帧）**无效**。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>应用名称，取值与直播流地址的 `AppName` 字段取值相同，由 1 到 30 位数字（0 - 9）、大写小字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，默认为空。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- `App` 取值为空时，`Stream` 取值也需为空，表示垫片配置为 Vhost 级别的全局配置。</p>
     *
     * <p>- `App` 取值不为空时，`Stream` 取值含义请参见 `Stream` 参数说明。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址的 StreamName 字段取值相同，由 1 到 100 位数字（0 - 9）、大写小字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- `App` 取值不为空、`Stream` 取值为空时，表示垫片配置为 `Vhost` + `App` 级别的配置。</p>
     *
     * <p>- `App` 取值不为空、`Stream` 取值不为空时，表示垫片配置为 `Vhost` + `App` + `Stream` 级别的配置</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
