package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetAllImageServicesQuery
 */
@lombok.Data
public final class GetAllImageServicesQuery  {

    /**
     * <p>筛选服务的参数，当该值为空时返回所有服务，指定后返回服务名或者 ID 中包含该字符串的服务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
