package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopResolutionURLResResultTopUrlDataItem
 */
@lombok.Data
public final class DescribeImageXSensibleTopResolutionURLResResultTopUrlDataItem  {

    /**
     * <p>上报次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>图片高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageHeight")
    private Integer imageHeight;

    /**
     * <p>图片宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageWidth")
    private Integer imageWidth;

    /**
     * <p>图片 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>图片展示背景 view 高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ViewHeight")
    private Integer viewHeight;

    /**
     * <p>图片展示背景 view 宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ViewWidth")
    private Integer viewWidth;

    /**
     * <p>Activity+View 树，控件信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActivityViewTree")
    private String activityViewTree;

    /**
     * <p>业务标识</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BizTag")
    private String bizTag;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
