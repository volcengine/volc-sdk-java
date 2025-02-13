package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadStreamListRes
 */
@lombok.Data
public final class DescribeLivePadStreamListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLivePadStreamListResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLivePadStreamListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
