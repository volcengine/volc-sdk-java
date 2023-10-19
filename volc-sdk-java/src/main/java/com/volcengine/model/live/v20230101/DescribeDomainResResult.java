package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDomainResResult
 */
@lombok.Data
public final class DescribeDomainResResult  {

    /**
     * <p>域名详细信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<DescribeDomainResResultDomainListItem> domainList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
