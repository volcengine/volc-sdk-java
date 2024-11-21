package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyGlobalAcceleration
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyGlobalAcceleration  {

    /**
     * <p>是否开启全球加速，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
