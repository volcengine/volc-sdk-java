package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestHttpCodeByTimeResResultDataItem
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeByTimeResResultDataItem  {

    /**
     * <p>状态码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HttpCode")
    private String httpCode;

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXMirrorRequestHttpCodeByTimeResResultDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
