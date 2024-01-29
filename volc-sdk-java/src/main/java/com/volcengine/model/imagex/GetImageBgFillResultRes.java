package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageBgFillResultRes
 */
@lombok.Data
public final class GetImageBgFillResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageBgFillResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageBgFillResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
