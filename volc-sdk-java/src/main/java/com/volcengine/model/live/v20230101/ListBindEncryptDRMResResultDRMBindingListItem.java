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
     * <p>当前 DRM 配置是否开启，取值及含义如下所示。</p>
     *
     * <p>- `true`：开启；</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>进行 DRM 加密的转码流对应的转码流后缀配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptTranscodeSuffix")
    private List<String> encryptTranscodeSuffix;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
