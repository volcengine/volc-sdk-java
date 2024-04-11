package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHTTPHeaderConfigBodyHeaderConfigListItem
 */
@lombok.Data
public final class UpdateHTTPHeaderConfigBodyHeaderConfigListItem  {

    /**
     * <p>Header 配置中字段的 Key 值，最大长度为 1024 个字符，多个 Header 不可重名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderKey")
    private String headerKey;

    /**
     * <p>Header 配置中字段的 Value 值，最大长度为 1024 个字符，支持使用常量和变量作为 Value 值。</p>
     *
     *
     *
     * <p>HTTP Header 类型为回源请求头时，支持使用以下变量为 Value 赋值：</p>
     *
     * <p>- `${domain}`：客户端拉流请求中使用的域名。</p>
     *
     * <p>- `${uri}`：客户端拉流请求中不包括查询参数的路径。如果请求被重写，则表示重写后的路径。</p>
     *
     * <p>- `${args}`：客户端拉流请求中的查询参数。如果请求被重写，则表示重写后的参数。</p>
     *
     * <p>- `${remote_addr}`：发送拉流请求的客户端 IP 地址。</p>
     *
     * <p>- `${server_addr}`：响应客户端拉流请求的 CDN 节点 IP 地址。</p>
     *
     *
     *
     *
     *
     * <p>HTTP Header 类型为请求响应头时，支持使用以下变量为 Value 赋值：</p>
     *
     * <p>- `${upstream_host}`：客户端拉流请求中使用的域名。</p>
     *
     * <p>- `${upstream_uri}`：客户端拉流请求中不包括查询参数的路径。如果请求被重写，则表示重写后的路径。</p>
     *
     * <p>- `${upstream_args}`：客户端拉流请求中的查询参数。如果请求被重写，则表示重写后的参数。</p>
     *
     * <p>- `${remote_addr}`：发送拉流请求的客户端 IP 地址。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderValue")
    private String headerValue;

    /**
     * <p>Header 配置中字段 Value 值的类型，取值及含义如下所示。</p>
     *
     * <p>- `0`：常量；</p>
     *
     * <p>- `1`：变量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderFieldType")
    private Integer headerFieldType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
