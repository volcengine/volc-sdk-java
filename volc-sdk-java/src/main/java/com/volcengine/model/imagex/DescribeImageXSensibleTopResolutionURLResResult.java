package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleTopResolutionURLResResult
 */
@lombok.Data
public final class DescribeImageXSensibleTopResolutionURLResResult  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopUrlData")
    private List<DescribeImageXSensibleTopResolutionURLResResultTopUrlDataItem> topUrlData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
