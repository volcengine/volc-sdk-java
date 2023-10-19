package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullRecordTaskRes
 */
@lombok.Data
public final class ListPullRecordTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListPullRecordTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListPullRecordTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
