package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleTopRamURLResResult
 */
@lombok.Data
public final class DescribeImageXSensibleTopRamURLResResult  {

    /**
     * <p>Top URL 数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopUrlData")
    private List<DescribeImageXSensibleTopRamURLResResultTopUrlDataItem> topUrlData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
