package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListDomainDetailResResult
 */
@lombok.Data
public final class ListDomainDetailResResult  {

    /**
     * <p>域名详细信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<ListDomainDetailResResultDomainListItem> domainList;

    /**
     * <p>按当前筛选条件查询的结果数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
