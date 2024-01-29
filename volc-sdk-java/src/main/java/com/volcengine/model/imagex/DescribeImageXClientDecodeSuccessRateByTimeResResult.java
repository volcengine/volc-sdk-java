package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientDecodeSuccessRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientDecodeSuccessRateByTimeResResult  {

    /**
     * <p>解码成功率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRateData")
    private List<DescribeImageXClientDecodeSuccessRateByTimeResResultSuccessRateDataItem> successRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
