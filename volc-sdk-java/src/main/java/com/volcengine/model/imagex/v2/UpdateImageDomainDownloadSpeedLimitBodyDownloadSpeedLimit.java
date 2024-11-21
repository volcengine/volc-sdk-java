package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainDownloadSpeedLimitBodyDownloadSpeedLimit
 */
@lombok.Data
public final class UpdateImageDomainDownloadSpeedLimitBodyDownloadSpeedLimit  {

    /**
     * <p>限速规则配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "rules")
    private List<UpdateImageDomainDownloadSpeedLimitBodyDownloadSpeedLimitRulesItem> rules;

    /**
     * <p>是否开启下载限速功能，取值如下所示： </p>
     *
     * <p>- `true`：开启 </p>
     *
     * <p>- `false`：关闭 </p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当 `enabled` 为 `true` 时，`rules` 等配置项有效</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
