package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestHttpCodeOverviewResResultDataItem
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeOverviewResResultDataItem  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>总请求次数，单位为次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>详细数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Details")
    private List<DescribeImageXMirrorRequestHttpCodeOverviewResResultDataItemDetailsItem> details;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
