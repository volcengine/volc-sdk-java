package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadStreamListBody
 */
@lombok.Data
public final class DescribeLivePadStreamListBody  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Long pageNum;

    /**
     * <p>分页大小。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Long pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
