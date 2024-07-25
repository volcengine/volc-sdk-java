package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdatePodPropertyBody
 */
@lombok.Data
public final class UpdatePodPropertyBody  {

    /**
     * <p>实例所归属的业务 ID，可在云手机控制台-业务管理-业务详情中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例 ID 列表。一次请求，目前最多支持 100 条。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>实例 Settings 属性列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodSettings")
    private List<com.volcengine.model.acep.v20231030.RequestSettings> podSettings;

    /**
     * <p>实例系统属性列表，非持久化，立即生效，重启实例后失效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodProperties")
    private List<com.volcengine.model.acep.v20231030.RequestSystemProperty> podProperties;

    /**
     * <p>实例系统属性列表，持久化，立即生效，重启实例后持久化保存。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodPersistProperties")
    private List<com.volcengine.model.acep.v20231030.RequestSystemProperty> podPersistProperties;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
