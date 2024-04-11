package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHTTPHeaderConfigResResultHeaderConfigListItemHeaderDetailListItem
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigResResultHeaderConfigListItemHeaderDetailListItem  {

    /**
     * <p>Header 配置中字段的 Key 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderKey")
    private String headerKey;

    /**
     * <p>Header 配置中字段的 Value 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderValue")
    private String headerValue;

    /**
     * <p>Header 配置中字段 Value 值的类型，取值及含义如下所示。</p>
     *
     * <p>- `0`：常量；</p>
     *
     * <p>- `1`：变量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderFieldType")
    private Integer headerFieldType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
