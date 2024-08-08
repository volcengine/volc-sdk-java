package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopUnknownURLResResultTopUrlDataItem
 */
@lombok.Data
public final class DescribeImageXSensibleTopUnknownURLResResultTopUrlDataItem  {

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
     * <p>展示 view 高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ViewHeight")
    private Integer viewHeight;

    /**
     * <p>展示 view 宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ViewWidth")
    private Integer viewWidth;

    /**
     * <p>文件大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSize")
    private Integer fileSize;

    /**
     * <p>图片内存大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RamSize")
    private Integer ramSize;

    /**
     * <p>图片 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

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
