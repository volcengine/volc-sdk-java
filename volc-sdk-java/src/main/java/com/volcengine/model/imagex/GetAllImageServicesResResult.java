package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllImageServicesResResult
 */
@lombok.Data
public final class GetAllImageServicesResResult  {

    /**
     * <p>所有的服务信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Services")
    private List<GetAllImageServicesResResultServicesItem> services;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
