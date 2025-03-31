package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyShareCache
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyShareCache  {

    /**
     * <p>共享域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domains")
    private List<String> domains;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
