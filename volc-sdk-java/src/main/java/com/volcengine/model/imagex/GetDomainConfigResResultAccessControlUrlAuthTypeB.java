package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlUrlAuthTypeB
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlUrlAuthTypeB  {

    /**
     * <p>主鉴权密钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "main_sk")
    private String mainSk;

    /**
     * <p>备用鉴权密钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "backup_sk")
    private String backupSk;

    /**
     * <p>有效时间，单位为秒。取值范围为[1, 630720000]内的正整数，默认为 1800 秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "expire_time")
    private Integer expireTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
