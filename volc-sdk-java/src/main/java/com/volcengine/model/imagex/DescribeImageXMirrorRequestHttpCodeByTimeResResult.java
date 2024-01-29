package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestHttpCodeByTimeResResult
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeByTimeResResult  {

    /**
     * <p>数据列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXMirrorRequestHttpCodeByTimeResResultDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
