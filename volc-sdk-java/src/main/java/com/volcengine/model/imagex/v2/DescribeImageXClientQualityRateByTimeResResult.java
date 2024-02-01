package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientQualityRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientQualityRateByTimeResResult  {

    /**
     * <p>黑白屏率数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QualityRateData")
    private List<DescribeImageXClientQualityRateByTimeResResultQualityRateDataItem> qualityRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
