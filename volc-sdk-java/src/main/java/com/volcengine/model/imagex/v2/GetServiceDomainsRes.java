package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetServiceDomainsRes
 */
@lombok.Data
public final class GetServiceDomainsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetServiceDomainsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<GetServiceDomainsResResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
