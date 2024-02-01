package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXEdgeRequestBandwidthResResult
 */
@lombok.Data
public final class DescribeImageXEdgeRequestBandwidthResResult  {

    /**
     * <p>带宽数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BpsData")
    private List<DescribeImageXEdgeRequestBandwidthResResultBpsDataItem> bpsData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
