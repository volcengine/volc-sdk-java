package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyUrlAuthTypeA
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyUrlAuthTypeA  {

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
     * <p>md5hash 参数名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "sign_param")
    private String signParam;

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
