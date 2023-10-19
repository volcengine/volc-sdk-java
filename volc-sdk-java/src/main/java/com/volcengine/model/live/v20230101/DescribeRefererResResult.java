package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRefererResResult
 */
@lombok.Data
public final class DescribeRefererResResult  {

    /**
     * <p>Referer 防盗链信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefererList")
    private List<DescribeRefererResResultRefererListItem> refererList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
