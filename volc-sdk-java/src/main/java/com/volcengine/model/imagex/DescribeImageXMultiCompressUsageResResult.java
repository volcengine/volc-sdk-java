package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMultiCompressUsageResResult
 */
@lombok.Data
public final class DescribeImageXMultiCompressUsageResResult  {

    /**
     * <p>多文件压缩用量数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompressData")
    private List<DescribeImageXMultiCompressUsageResResultCompressDataItem> compressData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
