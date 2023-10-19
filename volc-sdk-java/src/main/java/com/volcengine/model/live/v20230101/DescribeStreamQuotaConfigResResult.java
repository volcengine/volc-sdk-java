package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeStreamQuotaConfigResResult
 */
@lombok.Data
public final class DescribeStreamQuotaConfigResResult  {

    /**
     * <p>限额配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaList")
    private List<DescribeStreamQuotaConfigResResultQuotaListItem> quotaList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
