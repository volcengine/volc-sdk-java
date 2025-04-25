package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCertV2ResResult
 */
@lombok.Data
public final class ListCertV2ResResult  {

    /**
     * <p>证书列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CertList")
    private List<ListCertV2ResResultCertListItem> certList;

    /**
     * <p>本次查询范围内，所有证书的过期信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpirationInfo")
    private ListCertV2ResResultExpirationInfo expirationInfo;

    /**
     * <p>当前查询结果中证书的总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
