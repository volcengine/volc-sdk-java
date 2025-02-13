package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadStreamListResResultStreamListItem
 */
@lombok.Data
public final class DescribeLivePadStreamListResResultStreamListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用程序的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
