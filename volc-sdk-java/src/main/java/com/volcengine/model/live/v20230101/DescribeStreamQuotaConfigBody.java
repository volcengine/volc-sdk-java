package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeStreamQuotaConfigBody
 */
@lombok.Data
public final class DescribeStreamQuotaConfigBody  {

    /**
     * <p>待查询限额配置的推流域名或拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
