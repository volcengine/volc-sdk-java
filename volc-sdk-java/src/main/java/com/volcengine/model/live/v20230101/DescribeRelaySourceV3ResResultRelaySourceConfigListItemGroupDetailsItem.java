package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItem
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItem  {

    /**
     * <p>回源组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    /**
     * <p>回源服务器配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Servers")
    private List<DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItem> servers;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
