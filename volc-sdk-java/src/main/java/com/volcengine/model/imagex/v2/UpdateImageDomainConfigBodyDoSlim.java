package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyDoSlim
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyDoSlim  {

    /**
     * <p>是否开启集智瘦身，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启集智瘦身</p>
     *
     * <p>- `false`：关闭集智瘦身</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否关闭持久化。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：关闭</p>
     *
     * <p>- `false`：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "discard_slimed_file")
    private Boolean discardSlimedFile;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
