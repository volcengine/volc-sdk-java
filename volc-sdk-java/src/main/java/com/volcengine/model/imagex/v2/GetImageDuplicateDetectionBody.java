package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageDuplicateDetectionBody
 */
@lombok.Data
public final class GetImageDuplicateDetectionBody  {

    /**
     * <p>需要去重的图片 URL，多个地址以英文逗号分割。图片格式仅支持 JPEG（.jpeg 或 .jpg）和 PNG，支持格式混合输入。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Urls")
    private List<String> urls;

    /**
     * <p>是否使用异步，取值如下所示：</p>
     *
     * <p>* `true`：使用异步去重</p>
     *
     * <p>* `false`：（默认）不使用异步去重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Async")
    private Boolean async;

    /**
     * <p>当`Async`取值为`true`即启用异步时需要添加回调地址，地址使用 POST 请求方式。回调内容详见[回调参数](#回调参数)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>相似度阈值。上传图片数量超过 2 张并执行去重分组时，系统将对原图中满足该阈值的图片进行分组。取值范围为 [0,1]，默认值为 0.84。最多支持两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Similarity")
    private Double similarity;

    /**
     * <p>图像特征提取类型，取值如下所示：</p>
     *
     * <p>- `hash`：（默认）基于图像的像素值、颜色分布、纹理等特征生成哈希码，并通过哈希码进行比较来判定图片的相似度。该方式处理速度快，但对图片的旋转和颜色的敏感度较高，适用于大规模且纹理相对简单的图片的快速去重。</p>
     *
     * <p>- `cnn`：通过深度学习技术来提取图像的高级语义特征，如对象、场景和纹理等，这些特征用于比较不同图像之间的相似性。该提取方式鲁棒性较好，对旋转、缩放和变形的敏感度较低，适用于纹理复杂、细节丰富的图片去重。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtractorType")
    private String extractorType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
