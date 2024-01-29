package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopRamURLResResultTopUrlDataItem
 */
@lombok.Data
public final class DescribeImageXSensibleTopRamURLResResultTopUrlDataItem  {

    /**
     * <p>上报次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>图片 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>图片内存大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RamSize")
    private Integer ramSize;

    /**
     * <p>Activity+View 树，控件信息。</p>
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
