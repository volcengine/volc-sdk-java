package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * BindEncryptDRMBody
 */
@lombok.Data
public final class BindEncryptDRMBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址中 `AppName` 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>是否开启当前 DRM 加密配置，取值及含义如下所示。</p>
     *
     * <p>- `true`：（默认值）开启；</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>开启转码流加密时待加密的转码流对应的转码流后缀配置。您可以调用[查询转码配置列表](https://www.volcengine.com/docs/6469/1126853)接口或在视频直播控制台的[转码配置](https://console.volcengine.com/live/main/application/transcode)页面，查看转码配置的转码流后缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptTranscodeSuffix")
    private List<String> encryptTranscodeSuffix;

    /**
     * <p>加密类型，支持的取值及含义如下所示。</p>
     *
     * <p>- `FairPlay`：使用 FairPlay 技术的商业 DRM 加密；</p>
     *
     * <p>- `Widevine`：使用 Widevine 技术的商业 DRM 加密；</p>
     *
     * <p>- `PlayReady`：使用 PlayReady 技术的商业 DRM 加密；</p>
     *
     * <p>- `ClearKey`：HLS 标准加密。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>DRM 加密与 HLS 标准加密不可同时配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DRMSystems")
    private List<String> dRMSystems;

    /**
     * <p>是否开启源流加密，取值及含义如下所示。</p>
     *
     * <p>- `true`：开启；</p>
     *
     * <p>- `fasle`：不开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptOriginStream")
    private Boolean encryptOriginStream;

    /**
     * <p>是否开启转码流加密，取值及含义如下所示。</p>
     *
     * <p>- `true`：开启；</p>
     *
     * <p>- `fasle`：不开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptTranscodeStream")
    private Boolean encryptTranscodeStream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
