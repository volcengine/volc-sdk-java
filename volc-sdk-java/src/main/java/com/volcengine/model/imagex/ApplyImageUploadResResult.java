package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * ApplyImageUploadResResult
 */
@lombok.Data
public final class ApplyImageUploadResResult  {

    /**
     * <p>上传地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadAddress")
    private ApplyImageUploadResResultUploadAddress uploadAddress;

    /**
     * <p>请求的唯一标识 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
