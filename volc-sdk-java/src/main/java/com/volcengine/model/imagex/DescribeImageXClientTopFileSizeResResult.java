package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientTopFileSizeResResult
 */
@lombok.Data
public final class DescribeImageXClientTopFileSizeResResult  {

    /**
     * <p>Top URL 数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopUrlData")
    private List<DescribeImageXClientTopFileSizeResResultTopUrlDataItem> topUrlData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
