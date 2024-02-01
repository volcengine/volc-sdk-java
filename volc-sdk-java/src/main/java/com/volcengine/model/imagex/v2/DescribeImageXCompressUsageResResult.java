package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCompressUsageResResult
 */
@lombok.Data
public final class DescribeImageXCompressUsageResResult  {

    /**
     * <p>压缩量数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompressData")
    private List<DescribeImageXCompressUsageResResultCompressDataItem> compressData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
