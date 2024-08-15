package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetHLSEncryptDataKeyResResult
 */
@lombok.Data
public final class GetHLSEncryptDataKeyResResult  {

    /**
     * <p>密钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataKey")
    private String dataKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
