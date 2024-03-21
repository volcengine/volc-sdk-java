package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXExceedFileSizeResResult
 */
@lombok.Data
public final class DescribeImageXExceedFileSizeResResult  {

    /**
     * <p>客户端文件大小分布数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FSizeData")
    private List<DescribeImageXExceedFileSizeResResultFSizeDataItem> fSizeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
