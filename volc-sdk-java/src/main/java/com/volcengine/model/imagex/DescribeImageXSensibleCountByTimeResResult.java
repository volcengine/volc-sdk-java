package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleCountByTimeResResult
 */
@lombok.Data
public final class DescribeImageXSensibleCountByTimeResResult  {

    /**
     * <p>采集样本量数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SensibleCountData")
    private List<DescribeImageXSensibleCountByTimeResResultSensibleCountDataItem> sensibleCountData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
