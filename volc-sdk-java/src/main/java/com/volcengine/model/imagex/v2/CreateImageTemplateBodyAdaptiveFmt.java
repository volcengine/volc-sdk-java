package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplateBodyAdaptiveFmt
 */
@lombok.Data
public final class CreateImageTemplateBodyAdaptiveFmt  {

    /**
     * <p>静图自适应，具体实现说明参考[图像自适应压缩](https://www.volcengine.com/docs/508/75733)。取值如下所示：</p>
     *
     * <p>- `webp`：若 HTTP 请求头中 accept 头部包含 image/webp 的字符串匹配，则返回 webp 格式。否则返回 `OutputFormat` 指定格式。</p>
     *
     * <p>- `heic`：若 HTTP 请求头中 accept 头部包含 image/heic 的字符串匹配，则返回 webp 格式。否则返回 `OutputFormat` 指定格式。</p>
     *
     * <p>- `avif`：若 HTTP 请求头中 accept 头部包含 image/avif 的字符串匹配，则返回 webp 格式。否则返回 `OutputFormat` 指定格式。</p>
     *
     * <p>- `dynamic`：智能模式，即根据请求头中 MIME 查找具体格式，查找成功，则返回该格式，否则返回 `OutputFormat` 指定格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Static")
    private String myStatic;

    /**
     * <p>动图自适应，具体实现说明参考[图像自适应压缩](https://www.volcengine.com/docs/508/75733)。取值如下所示：</p>
     *
     * <p>取值如下所示：</p>
     *
     * <p>- `webp`：若 HTTP 请求头中 accept 头部包含 image/webp 的字符串匹配，则返回 webp 格式。否则返回 `OutputFormat` 指定格式。</p>
     *
     * <p>- `heic`：若 HTTP 请求头中 accept 头部包含 image/heic 的字符串匹配，则返回 webp 格式。否则返回 `OutputFormat` 指定格式。</p>
     *
     * <p>- `avif`：若 HTTP 请求头中 accept 头部包含 image/avif 的字符串匹配，则返回 webp 格式。否则返回 `OutputFormat` 指定格式。</p>
     *
     * <p>- `dynamic`：智能模式，即根据请求头中 MIME 查找具体格式，查找成功，则返回该格式，否则返回 `OutputFormat` 指定格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Animated")
    private String animated;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
