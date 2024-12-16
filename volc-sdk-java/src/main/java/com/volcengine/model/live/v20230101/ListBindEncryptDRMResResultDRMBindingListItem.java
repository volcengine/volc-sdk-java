package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListBindEncryptDRMResResultDRMBindingListItem
 */
@lombok.Data
public final class ListBindEncryptDRMResResultDRMBindingListItem  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>进行 DRM 加密的转码流对应的转码流后缀配置。</p>
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
