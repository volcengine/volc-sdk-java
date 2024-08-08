package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleTopUnknownURLResResult
 */
@lombok.Data
public final class DescribeImageXSensibleTopUnknownURLResResult  {

    /**
     * <p>Top URL 详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopUrlData")
    private List<DescribeImageXSensibleTopUnknownURLResResultTopUrlDataItem> topUrlData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
