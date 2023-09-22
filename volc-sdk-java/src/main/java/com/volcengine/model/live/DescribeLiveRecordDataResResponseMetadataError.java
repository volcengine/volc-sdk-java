package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveRecordDataResResponseMetadataError
 */
@lombok.Data
public final class DescribeLiveRecordDataResResponseMetadataError {

    /**
     * <p>错误码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>错误信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
