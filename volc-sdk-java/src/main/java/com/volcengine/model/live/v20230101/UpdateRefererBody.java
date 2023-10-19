package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRefererBody
 */
@lombok.Data
public final class UpdateRefererBody  {

    /**
     * <p>应用名称，默认为所有应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `App` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `App` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>Referer 防盗链信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefererInfoList")
    private List<UpdateRefererBodyRefererInfoListItem> refererInfoList;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
