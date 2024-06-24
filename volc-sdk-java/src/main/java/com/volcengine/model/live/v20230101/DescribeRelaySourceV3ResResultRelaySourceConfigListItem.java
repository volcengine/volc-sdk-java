package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItem
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItem  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回源组配置详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupDetails")
    private List<DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItem> groupDetails;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
