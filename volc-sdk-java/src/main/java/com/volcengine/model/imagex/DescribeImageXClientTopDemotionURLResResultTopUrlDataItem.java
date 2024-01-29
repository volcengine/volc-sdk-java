package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientTopDemotionURLResResultTopUrlDataItem
 */
@lombok.Data
public final class DescribeImageXClientTopDemotionURLResResultTopUrlDataItem  {

    /**
     * <p>文件 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>上报数据量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
