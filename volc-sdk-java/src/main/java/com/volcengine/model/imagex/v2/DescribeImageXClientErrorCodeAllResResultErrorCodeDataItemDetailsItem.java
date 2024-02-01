package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientErrorCodeAllResResultErrorCodeDataItemDetailsItem
 */
@lombok.Data
public final class DescribeImageXClientErrorCodeAllResResultErrorCodeDataItemDetailsItem  {

    /**
     * <p>错误码内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCode")
    private String errorCode;

    /**
     * <p>错误码的描述信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeDesc")
    private String errorCodeDesc;

    /**
     * <p>错误码数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
