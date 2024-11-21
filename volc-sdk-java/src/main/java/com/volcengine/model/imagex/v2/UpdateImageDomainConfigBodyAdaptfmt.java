package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyAdaptfmt
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyAdaptfmt  {

    /**
     * <p>是否开启自适应，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启自适应</p>
     *
     * <p>- `false`：关闭自适应</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>自适应格式列表，支持以下取值：</p>
     *
     *
     *
     * <p>- `webp`：WEBP 自适应</p>
     *
     * <p>- `heic`：HEIC 自适应</p>
     *
     * <p>- `avif`：AVIF 自适应</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "adapt_formats")
    private List<String> adaptFormats;

    /**
     * <p>是否开启体积校验，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "check_adapt_fsize")
    private Boolean checkAdaptFsize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
