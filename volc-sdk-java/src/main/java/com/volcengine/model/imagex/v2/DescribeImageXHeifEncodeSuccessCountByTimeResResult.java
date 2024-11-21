package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeSuccessCountByTimeResResult
 */
@lombok.Data
public final class DescribeImageXHeifEncodeSuccessCountByTimeResResult  {

    /**
     * <p>编码成功次数数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessCountData")
    private List<DescribeImageXHeifEncodeSuccessCountByTimeResResultSuccessCountDataItem> successCountData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
