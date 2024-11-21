package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DownloadCertQuery
 */
@lombok.Data
public final class DownloadCertQuery  {

    /**
     * <p>证书 ID，您可以通过调用 [获取账号下全部证书](https://www.volcengine.com/docs/508/66017) 获取账号下所有证书信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
