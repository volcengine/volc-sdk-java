package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateHmExtractTaskBody
 */
@lombok.Data
public final class CreateHmExtractTaskBody  {

    /**
     * <p>盲水印强度，取值如下所示：</p>
     *
     * <p>- `low`：低强度，适用于对图像质量要求高。</p>
     *
     * <p>- `medium`：中强度。</p>
     *
     * <p>- `strong`：（推荐）高强度，适合图像纹理丰富时使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Strength")
    private String strength;

    /**
     * <p>算法模型，取值如下：</p>
     *
     *
     *
     * <p>- `tracev2`：前景图层水印模型（彩色背景通用）</p>
     *
     * <p>-  `tracev2-app`：前景图层水印模型（移动端）</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>指定 `tracev2`、`tracev2-app` 模型时，请传入已添加对应模型水印的背景网页的**截图**。若图片错误，则无法提取水印。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    /**
     * <p>待提取盲水印的图片的 URI。`StoreUri` 和 `ImageUrl` 都不为空时，以 `StoreUri` 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>待提取盲水印图片的 URL。`StoreUri` 和 `ImageUrl` 都不为空时，以 `StoreUri` 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    /**
     * <p>任务回调地址，回调内容详见[盲水印提取回调](https://www.volcengine.com/docs/508/1554763)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
