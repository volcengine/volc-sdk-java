package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientTopDemotionURLResResult
 */
@lombok.Data
public final class DescribeImageXClientTopDemotionURLResResult  {

    /**
     * <p>Top URL 数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopUrlData")
    private List<DescribeImageXClientTopDemotionURLResResultTopUrlDataItem> topUrlData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
