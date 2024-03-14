package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageServiceResResultResourceLimitedVisit
 */
@lombok.Data
public final class GetImageServiceResResultResourceLimitedVisit  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowDomains")
    private List<String> allowDomains;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
