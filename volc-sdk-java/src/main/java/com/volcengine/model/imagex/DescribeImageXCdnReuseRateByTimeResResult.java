package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnReuseRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXCdnReuseRateByTimeResResult  {

    /**
     * <p>连接复用率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReuseRateData")
    private List<DescribeImageXCdnReuseRateByTimeResResultReuseRateDataItem> reuseRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
