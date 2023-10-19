package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeAuthResResult
 */
@lombok.Data
public final class DescribeAuthResResult  {

    /**
     * <p>推/拉流鉴权列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthList")
    private List<DescribeAuthResResultAuthListItem> authList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
