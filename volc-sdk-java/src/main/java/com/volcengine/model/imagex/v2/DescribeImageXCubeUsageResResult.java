package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCubeUsageResResult
 */
@lombok.Data
public final class DescribeImageXCubeUsageResResult  {

    /**
     * <p>创意魔方用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CubeData")
    private List<DescribeImageXCubeUsageResResultCubeDataItem> cubeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
