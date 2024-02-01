package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceV3Body
 */
@lombok.Data
public final class DescribeRelaySourceV3Body  {

    /**
     * <p>域名空间名称，由 1 到 60 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回源组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
