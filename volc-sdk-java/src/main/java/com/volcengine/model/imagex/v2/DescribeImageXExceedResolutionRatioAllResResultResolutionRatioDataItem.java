package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXExceedResolutionRatioAllResResultResolutionRatioDataItem
 */
@lombok.Data
public final class DescribeImageXExceedResolutionRatioAllResResultResolutionRatioDataItem  {

    /**
     * <p>大图样本量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    /**
     * <p>宽比，即为图片宽/view宽取整</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WidthRatio")
    private Integer widthRatio;

    /**
     * <p>高比，即为图片高/view高取整</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeightRatio")
    private Integer heightRatio;

    /**
     * <p>格式为：宽比-高比</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ratio")
    private String ratio;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
