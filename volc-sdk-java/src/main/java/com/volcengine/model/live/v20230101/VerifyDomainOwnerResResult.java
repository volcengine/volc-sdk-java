package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * VerifyDomainOwnerResResult
 */
@lombok.Data
public final class VerifyDomainOwnerResResult  {

    /**
     * <p>检查结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CheckResult")
    private Boolean checkResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
