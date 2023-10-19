package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateStreamQuotaConfigBody
 */
@lombok.Data
public final class UpdateStreamQuotaConfigBody  {

    /**
     * <p>需要配置限额的推流域名或拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>限额配置详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaDetailList")
    private List<UpdateStreamQuotaConfigBodyQuotaDetailListItem> quotaDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
