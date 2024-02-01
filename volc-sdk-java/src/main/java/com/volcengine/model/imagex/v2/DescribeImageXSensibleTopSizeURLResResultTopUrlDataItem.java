package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSensibleTopSizeURLResResultTopUrlDataItem
 */
@lombok.Data
public final class DescribeImageXSensibleTopSizeURLResResultTopUrlDataItem  {

    /**
     * <p>Activity+View 树，控件信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActivityViewTree")
    private String activityViewTree;

    /**
     * <p>上报次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>文件体积</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    /**
     * <p>文件URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

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
