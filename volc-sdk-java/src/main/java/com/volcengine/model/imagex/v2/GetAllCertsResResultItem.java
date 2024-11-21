package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllCertsResResultItem
 */
@lombok.Data
public final class GetAllCertsResResultItem  {

    /**
     * <p>证书ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertID")
    private String certID;

    /**
     * <p>证书名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertName")
    private String certName;

    /**
     * <p>允许https使用的域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CommonName")
    private String commonName;

    /**
     * <p>创建时间戳</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Double createTime;

    /**
     * <p>过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotAfter")
    private Double notAfter;

    /**
     * <p>签发机构</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Issuer")
    private String issuer;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "San")
    private List<String> san;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
