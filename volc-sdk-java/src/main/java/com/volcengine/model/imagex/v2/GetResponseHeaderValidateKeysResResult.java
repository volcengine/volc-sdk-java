package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetResponseHeaderValidateKeysResResult
 */
@lombok.Data
public final class GetResponseHeaderValidateKeysResResult  {

    /**
     * <p>合法的响应头 key 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidateRespHdrKeys")
    private List<String> validateRespHdrKeys;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
