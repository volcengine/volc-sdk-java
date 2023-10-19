package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRefererBody
 */
@lombok.Data
public final class DeleteRefererBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名。</p>
     *
     * <p>- 如创建时传了 `Domain`，删除时需要传该参数；</p>
     *
     * <p>- 如创建时未传 `Domain`，删除时不传该参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称</p>
     *
     * <p>- 如创建时传了 `App`，删除时需要传该参数；</p>
     *
     * <p>- 如创建时未传 `App`，删除时不传该参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
