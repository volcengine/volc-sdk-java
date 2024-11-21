package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeFileInSizeByTimeResResult
 */
@lombok.Data
public final class DescribeImageXHeifEncodeFileInSizeByTimeResResult  {

    /**
     * <p>文件大小数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSizeData")
    private List<DescribeImageXHeifEncodeFileInSizeByTimeResResultFileSizeDataItem> fileSizeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
