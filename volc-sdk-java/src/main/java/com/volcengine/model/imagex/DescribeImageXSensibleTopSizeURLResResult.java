package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleTopSizeURLResResult
 */
@lombok.Data
public final class DescribeImageXSensibleTopSizeURLResResult  {

    /**
     * <p>Top URL数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopUrlData")
    private List<DescribeImageXSensibleTopSizeURLResResultTopUrlDataItem> topUrlData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
