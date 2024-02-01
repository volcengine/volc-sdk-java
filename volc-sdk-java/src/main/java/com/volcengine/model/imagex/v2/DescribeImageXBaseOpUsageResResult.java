package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBaseOpUsageResResult
 */
@lombok.Data
public final class DescribeImageXBaseOpUsageResResult  {

    /**
     * <p>计量数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BaseOpData")
    private List<DescribeImageXBaseOpUsageResResultBaseOpDataItem> baseOpData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
