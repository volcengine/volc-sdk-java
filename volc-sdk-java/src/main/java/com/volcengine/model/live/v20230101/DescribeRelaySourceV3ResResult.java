package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV3ResResult
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResult  {

    /**
     * <p>回源配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceConfigList")
    private List<DescribeRelaySourceV3ResResultRelaySourceConfigListItem> relaySourceConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
