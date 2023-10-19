package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigResResultDenyListItem
 */
@lombok.Data
public final class DescribeDenyConfigResResultDenyListItem  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>配置详情列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyConfig")
    private List<DescribeDenyConfigResResultDenyListItemDenyConfigItem> denyConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
