package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeSuccessRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXHeifEncodeSuccessRateByTimeResResult  {

    /**
     * <p>编码成功率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRateData")
    private List<DescribeImageXHeifEncodeSuccessRateByTimeResResultSuccessRateDataItem> successRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
