package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadSuccessRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXUploadSuccessRateByTimeResResult  {

    /**
     * <p>上传成功率数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRateData")
    private List<DescribeImageXUploadSuccessRateByTimeResResultSuccessRateDataItem> successRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
