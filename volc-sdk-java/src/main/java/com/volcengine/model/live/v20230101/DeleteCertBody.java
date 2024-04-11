package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCertBody
 */
@lombok.Data
public final class DeleteCertBody  {

    /**
     * <p>待删除的 HTTPS 证书的证书链 ID，可以通过[查询证书列表](https://www.volcengine.com/docs/6469/1126822)接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
