package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestHttpCodeOverviewResResult
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeOverviewResResult  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXMirrorRequestHttpCodeOverviewResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
