package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * SetProxyBody
 */
@lombok.Data
public final class SetProxyBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>需要设置代理的实例 ID 列表，可通过调用 ListPod 接口获取。列表长度上限为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>是否开启代理：</p>
     *
     *
     *
     * <p>- 1：开启；</p>
     *
     *
     *
     * <p>- 0：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyStatus")
    private Integer proxyStatus;

    /**
     * <p>代理配置键值对。具体参看 [ProxyConfig 字段说明](#proxyconfig-字段说明)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProxyConfig")
    private Map<String, String> proxyConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
