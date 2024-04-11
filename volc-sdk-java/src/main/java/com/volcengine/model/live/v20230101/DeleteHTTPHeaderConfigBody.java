package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteHTTPHeaderConfigBody
 */
@lombok.Data
public final class DeleteHTTPHeaderConfigBody  {

    /**
     * <p>域名空间，您可以调用 [DescribeHTTPHeaderConfig](https://www.volcengine.com/docs/6469/1232744) 接口查看 HTTP Header 配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名，您可以调用 [DescribeHTTPHeaderConfig](https://www.volcengine.com/docs/6469/1232744) 接口查看 HTTP Header 配置的 `Domain` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>HTTP Header 类型，您可以调用 [DescribeHTTPHeaderConfig](https://www.volcengine.com/docs/6469/1232744) 接口查看 HTTP Header 配置的 `Phase` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
