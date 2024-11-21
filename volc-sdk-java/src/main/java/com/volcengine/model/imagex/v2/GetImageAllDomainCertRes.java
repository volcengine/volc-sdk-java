package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAllDomainCertRes
 */
@lombok.Data
public final class GetImageAllDomainCertRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAllDomainCertResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<GetImageAllDomainCertResResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
