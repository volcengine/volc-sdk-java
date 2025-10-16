package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateAuthKeyBody
 */
@lombok.Data
public final class UpdateAuthKeyBody  {

    /**
     * <p>鉴权配置参数，包括鉴权密钥、鉴权参数、加密字符串生成算法等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthDetailList")
    private List<UpdateAuthKeyBodyAuthDetailListItem> authDetailList;

    /**
     * <p>直播流使用的域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否开启 URL 地址鉴权，取值及含义如下所示。</p>
     *
     * <p>- `false`：关闭（默认值）；</p>
     *
     * <p>- `true`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushPullEnable")
    private Boolean pushPullEnable;

    /**
     * <p>鉴权场景类型，取值及含义如下所示。</p>
     *
     * <p>- `push`：推流鉴权；</p>
     *
     * <p>- `pull`：拉流鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    /**
     * <p>鉴权生效时长，单位为秒，默认值为 `0`，取值范围为 [0,2592000]，超出生效时长后 URL 无法使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private Integer validDuration;

    /**
     * <p>时间戳进制。默认值为 `10`，但当 `AuthType` 取值为 `TypeC` 时，默认值为 `16`。取值如下：</p>
     *
     * <p>- `2`：二进制</p>
     *
     * <p>- `8`：八进制</p>
     *
     * <p>- `10`：十进制</p>
     *
     * <p>- `16`：十六进制</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`SceneType` 取值为 `push` 时，该参数取值固定为 `10`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStampBase")
    private Integer timeStampBase;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
