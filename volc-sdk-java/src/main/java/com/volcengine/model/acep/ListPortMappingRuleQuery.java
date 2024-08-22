package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListPortMappingRuleQuery
 */
@lombok.Data
public final class ListPortMappingRuleQuery  {

    /**
     * <p>云手机业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>筛选条件，端口映射规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleId")
    private String portMappingRuleId;

    /**
     * <p>筛选条件，端口映射的协议类型，取值如下：</p>
     *
     *
     *
     * <p>- `tcp`：TCP 协议类型。</p>
     *
     * <p>- `udp`：UDP 协议类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>资源所在的物理区域，包含以下选项：</p>
     *
     *
     *
     * <p>- `inner`：中国大陆（默认值）</p>
     *
     * <p>- `cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    /**
     * <p>筛选条件，分页参数，偏移量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>筛选条件，分页参数，查询数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
