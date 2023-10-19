package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAuditDataResResultAuditDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveAuditDataResResultAuditDetailDataListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>审核总张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    /**
     * <p>审核数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDataList")
    private List<DescribeLiveAuditDataResResultAuditDetailDataListItemAuditDataListItem> auditDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
