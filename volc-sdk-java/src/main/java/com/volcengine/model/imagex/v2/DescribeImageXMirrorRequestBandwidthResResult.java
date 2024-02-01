package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestBandwidthResResult
 */
@lombok.Data
public final class DescribeImageXMirrorRequestBandwidthResResult  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXMirrorRequestBandwidthResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
