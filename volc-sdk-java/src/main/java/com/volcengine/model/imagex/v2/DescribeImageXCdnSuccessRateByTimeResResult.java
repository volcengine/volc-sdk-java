package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnSuccessRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXCdnSuccessRateByTimeResResult  {

    /**
     * <p>网络成功率数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRateData")
    private List<DescribeImageXCdnSuccessRateByTimeResResultSuccessRateDataItem> successRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
