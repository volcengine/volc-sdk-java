package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXExceedCountByTimeResResult
 */
@lombok.Data
public final class DescribeImageXExceedCountByTimeResResult  {

    /**
     * <p>大图样本量上报数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExceedCountData")
    private List<DescribeImageXExceedCountByTimeResResultExceedCountDataItem> exceedCountData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
