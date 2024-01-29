package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadCountByTimeResResult
 */
@lombok.Data
public final class DescribeImageXUploadCountByTimeResResult  {

    /**
     * <p>上传有效次数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadCountData")
    private List<DescribeImageXUploadCountByTimeResResultUploadCountDataItem> uploadCountData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
