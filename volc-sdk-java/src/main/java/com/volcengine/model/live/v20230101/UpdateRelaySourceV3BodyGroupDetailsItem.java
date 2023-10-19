package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItem
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItem  {

    /**
     * <p>回源组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    /**
     * <p>回源服务器配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Servers")
    private List<UpdateRelaySourceV3BodyGroupDetailsItemServersItem> servers;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
