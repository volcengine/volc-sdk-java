package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnSuccessRateAllResResult
 */
@lombok.Data
public final class DescribeImageXCdnSuccessRateAllResResult  {

    /**
     * <p>网络成功率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRateData")
    private List<DescribeImageXCdnSuccessRateAllResResultSuccessRateDataItem> successRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
