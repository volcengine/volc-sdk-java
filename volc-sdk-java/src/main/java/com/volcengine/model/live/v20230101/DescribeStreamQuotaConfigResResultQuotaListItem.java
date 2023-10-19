package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeStreamQuotaConfigResResultQuotaListItem
 */
@lombok.Data
public final class DescribeStreamQuotaConfigResResultQuotaListItem  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名或拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>配置详情列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaDetailList")
    private List<DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItem> quotaDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
