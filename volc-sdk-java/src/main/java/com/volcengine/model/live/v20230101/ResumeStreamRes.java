package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ResumeStreamRes
 */
@lombok.Data
public final class ResumeStreamRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResumeStreamResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
