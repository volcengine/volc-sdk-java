package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCertBody
 */
@lombok.Data
public final class DeleteCertBody  {

    /**
     * <p>待删除的证书链 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
