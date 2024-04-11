package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * EnableHTTPHeaderConfigBody
 */
@lombok.Data
public final class EnableHTTPHeaderConfigBody  {

    /**
     * <p>域名空间，您可以调用 [DescribeHTTPHeaderConfig](https://www.volcengine.com/docs/6469/1232744) 接口查看 HTTP Header 配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>HTTP Header 类型，您可以调用 [DescribeHTTPHeaderConfig](https://www.volcengine.com/docs/6469/1232744) 接口查看 HTTP Header 配置的 `Phase` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    /**
     * <p>启用或禁用配置，取值及含义如下所示。</p>
     *
     * <p>- `true`：启用；</p>
     *
     * <p>- `false`：禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>拉流域名，您可以调用 [DescribeHTTPHeaderConfig](https://www.volcengine.com/docs/6469/1232744) 接口查看 HTTP Header 配置的 `Domain` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
