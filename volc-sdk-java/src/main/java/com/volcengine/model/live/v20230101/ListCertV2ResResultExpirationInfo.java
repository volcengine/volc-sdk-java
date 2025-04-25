package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCertV2ResResultExpirationInfo
 */
@lombok.Data
public final class ListCertV2ResResultExpirationInfo  {

    /**
     * <p>本次查询所有证书中处于生效状态的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActiveNum")
    private Integer activeNum;

    /**
     * <p>本次查询所有证书中已过期的证书数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireNum")
    private Integer expireNum;

    /**
     * <p>表示一个月内即将过期的证书数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClosingExpireNum")
    private Integer closingExpireNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
