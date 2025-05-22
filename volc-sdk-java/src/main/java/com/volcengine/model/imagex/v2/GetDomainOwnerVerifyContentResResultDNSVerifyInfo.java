package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainOwnerVerifyContentResResultDNSVerifyInfo
 */
@lombok.Data
public final class GetDomainOwnerVerifyContentResResultDNSVerifyInfo  {

    /**
     * <p>主机记录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Host")
    private String host;

    /**
     * <p>记录类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordType")
    private String recordType;

    /**
     * <p>记录值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordValue")
    private String recordValue;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
