package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllCertsRes
 */
@lombok.Data
public final class GetAllCertsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetAllCertsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<GetAllCertsResResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
