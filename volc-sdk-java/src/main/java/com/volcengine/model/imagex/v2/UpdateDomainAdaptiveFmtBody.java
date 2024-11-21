package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateDomainAdaptiveFmtBody
 */
@lombok.Data
public final class UpdateDomainAdaptiveFmtBody  {

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否开启自适应，取值如下所示：</p>
     *
     * <p>- `true`：开启自适应</p>
     *
     * <p>- `false`：关闭自适应</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdaptFmt")
    private Boolean adaptFmt;

    /**
     * <p>自适应格式列表，取值如下所示：</p>
     *
     *
     *
     * <p>- `webp`：WEBP 自适应</p>
     *
     * <p>- `heic`：HEIC 自适应</p>
     *
     * <p>- `avif`：AVIF 自适应</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdaptFormats")
    private List<String> adaptFormats;

    /**
     * <p>是否开启体积校验，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启。开启后会对经自适应编码后的图片体积和编码前原图体积进行对比，若编码后体积更小则输出编码后图片；否则输出原图。</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CheckAdaptFsize")
    private Boolean checkAdaptFsize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
