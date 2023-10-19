package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeIpInfoResResult
 */
@lombok.Data
public final class DescribeIpInfoResResult  {

    /**
     * <p>IP 详情列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<DescribeIpInfoResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
