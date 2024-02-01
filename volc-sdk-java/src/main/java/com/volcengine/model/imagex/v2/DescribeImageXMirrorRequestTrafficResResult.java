package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestTrafficResResult
 */
@lombok.Data
public final class DescribeImageXMirrorRequestTrafficResResult  {

    /**
     * <p>数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXMirrorRequestTrafficResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
