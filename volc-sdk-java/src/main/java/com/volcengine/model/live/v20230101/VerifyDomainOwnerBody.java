package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * VerifyDomainOwnerBody
 */
@lombok.Data
public final class VerifyDomainOwnerBody  {

    /**
     * <p>推拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>校验方式，取值：</p>
     *
     *
     *
     * <p>- **dnsCheck**：DNS验证。</p>
     *
     * <p>- **fileCheck**：文件验证。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VerifyType")
    private String verifyType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
