package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImagePSDetectionBody
 */
@lombok.Data
public final class GetImagePSDetectionBody  {

    /**
     * <p>原图的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>调用方法，默认为调用全部方法，若参数不为`all`，则其他方法仅可选一种。取值如下所示：</p>
     *
     * <p>- all：调用所有方法</p>
     *
     * <p>- ela：误差水平分析方法</p>
     *
     * <p>- na：噪声分析方法</p>
     *
     * <p>- he：基于颜色分布直方图均化的图像增强分析方法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
