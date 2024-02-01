package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientDemotionRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientDemotionRateByTimeResResult  {

    /**
     * <p>降级率数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionRateData")
    private List<DescribeImageXClientDemotionRateByTimeResResultDemotionRateDataItem> demotionRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
