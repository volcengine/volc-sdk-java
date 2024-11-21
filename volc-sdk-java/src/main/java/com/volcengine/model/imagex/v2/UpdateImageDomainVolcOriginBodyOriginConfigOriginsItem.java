package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainVolcOriginBodyOriginConfigOriginsItem
 */
@lombok.Data
public final class UpdateImageDomainVolcOriginBodyOriginConfigOriginsItem  {

    /**
     * <p>源站属性， primary：主源站； backup：备源站</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origin_type")
    private String originType;

    /**
     * <p>源站类型 ip：IP 类型源站； domain：域名类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "instance_type")
    private String instanceType;

    /**
     * <p>源站地址， 与 instance_type 填充的内容对应： instance_type 为 ip ，则仅可填充一条 IPv4 记录； instance_type 为 domain，则可填充一个域名，域名长度不超过 1024 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "address")
    private String address;

    /**
     * <p>HTTP 请求回源至对应 Address 的端口</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "http_port")
    private String httpPort;

    /**
     * <p>HTTPS 请求回源至对应 Address 的端口，修改时需要指定，取值范围为 1 ~ 65535</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "https_port")
    private String httpsPort;

    /**
     * <p>权重配置， 多源站配置场景下，权重决定了回源至对应源站的概率。  InstanceType 为 ip 时，指定当前 Address 对应的权重，取值范围为 1~1000。 InstanceType 为 domain 或 tos 时，权重默认为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "weight")
    private String weight;

    /**
     * <p>回源host， 指定源站的Address维度的回源 Host 的值; 若不为空，则优先级高于域名维度的OriginHost。 若为空，则遵循域名维度的OriginHost</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origin_host")
    private String originHost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
