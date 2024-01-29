package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageDuplicateDetectionBody
 */
@lombok.Data
public final class GetImageDuplicateDetectionBody  {

    /**
     * <p>需要去重的图片 URL，以英文逗号分割，输入图片格式 PNG，JPEG，支持格式混合输入。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Urls")
    private List<String> urls;

    /**
     * <p>是否使用异步，支持取值如下所示：</p>
     *
     * <p>* `true`：使用异步去重</p>
     *
     * <p>* `false`：不使用异步去重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Async")
    private Boolean async;

    /**
     * <p>当`Async`取值为`true`即启用异步时需要添加回调地址，地址使用 POST 请求方式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>当`Async`取值为`true`即启用异步时，该配置生效。</p>
     *
     * <p>相似度阈值，系统将对原图中满足该阈值的图片进行分组。取值范围为 [0,1]，默认值为 0.84。最多支持两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Similarity")
    private Double similarity;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
