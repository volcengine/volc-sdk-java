package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamUsageDataRes
 */
@lombok.Data
public final class DescribeLiveStreamUsageDataRes  {

    /**
     * <p>请求状态：</p>
     *
     * <p>- 1：请求成功</p>
     *
     * <p>- 0：请求失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>请求失败原因：</p>
     *
     * <p>- 请求成功时 Result 为空</p>
     *
     * <p>- 请求失败时 Result 展示失败的原因</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private String result;

    /**
     * <p>响应数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Response")
    private DescribeLiveStreamUsageDataResResponse response;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
