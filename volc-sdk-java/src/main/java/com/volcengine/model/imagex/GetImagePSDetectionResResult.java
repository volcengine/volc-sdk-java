package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImagePSDetectionResResult
 */
@lombok.Data
public final class GetImagePSDetectionResResult  {

    /**
     * <p>误差水平分析方法对应的图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ElaImage")
    private String elaImage;

    /**
     * <p>噪声分析方法对应的图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NaImage")
    private String naImage;

    /**
     * <p>基于颜色分布直方图均化的图像增强方法对应的图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeImage")
    private String heImage;

    /**
     * <p>置信度，取值范围为[0,1]。</p>
     *
     * <p>- 小于 0.3 为 PS 处理图；</p>
     *
     * <p>- 大于 0.7 为真图；</p>
     *
     * <p>- 取值范围为[0.3,0.7]之间的图片则为模型无法判断。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Score")
    private Double score;

    /**
     * <p>置信度标签，取值如下所示：</p>
     *
     * <p>- 1：正常</p>
     *
     * <p>- 0：高风险</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Label")
    private Integer label;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
