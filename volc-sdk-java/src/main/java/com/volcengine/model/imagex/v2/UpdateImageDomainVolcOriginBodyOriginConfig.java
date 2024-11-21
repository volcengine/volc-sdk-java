package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainVolcOriginBodyOriginConfig
 */
@lombok.Data
public final class UpdateImageDomainVolcOriginBodyOriginConfig  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "origins")
    private List<UpdateImageDomainVolcOriginBodyOriginConfigOriginsItem> origins;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
