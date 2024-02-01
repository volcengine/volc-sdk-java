package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageServiceResResultMirror
 */
@lombok.Data
public final class GetImageServiceResResultMirror  {

    /**
     * <p>下载图片的协议，支持取值：`http`、`https`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Schema")
    private String schema;

    /**
     * <p>镜像回源域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Host")
    private String host;

    /**
     * <p>带权重回源域名，key 为 String 类型时，代表镜像回源域名；value 为 Integer 类型时，代表域名权重。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Hosts")
    private Map<String, Integer> hosts;

    /**
     * <p>镜像源 URI，其中图片名用 %s 占位符替代，比如/obj/%s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private String source;

    /**
     * <p>镜像回源下载原图时，携带的 HTTP 头部，键值都为 String 类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Headers")
    private Map<String, String> headers;

    /**
     * <p>镜像源站</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Origin")
    private GetImageServiceResResultMirrorOrigin origin;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
