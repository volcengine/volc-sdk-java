package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultErrorInfo
 */
@lombok.Data
public final class ResultErrorInfo  {

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>错误码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCode")
    private Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorMessage")
    private String errorMessage;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
