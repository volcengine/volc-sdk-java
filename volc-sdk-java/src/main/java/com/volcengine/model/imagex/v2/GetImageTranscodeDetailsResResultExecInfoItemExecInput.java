package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsResResultExecInfoItemExecInput
 */
@lombok.Data
public final class GetImageTranscodeDetailsResResultExecInfoItemExecInput  {

    /**
     * <p>图片 url 或 uri</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Image")
    private String image;

    /**
     * <p>转码模板</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Template")
    private String template;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
