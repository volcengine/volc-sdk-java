package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXMirrorRequestHttpCodeOverviewResResultDataItemDetailsItem
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeOverviewResResultDataItemDetailsItem  {

    /**
     * <p>Http 状态码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HttpCode")
    private String httpCode;

    /**
     * <p>Http 状态码对应的请求次数，单位为次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
