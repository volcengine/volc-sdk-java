package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainAreaAccessRes
 */
@lombok.Data
public final class UpdateImageDomainAreaAccessRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageDomainAreaAccessResResponseMetadata responseMetadata;

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
