package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainVolcOriginRes
 */
@lombok.Data
public final class UpdateImageDomainVolcOriginRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageDomainVolcOriginResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private String result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
