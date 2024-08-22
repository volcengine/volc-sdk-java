package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailPortMappingRuleResResult
 */
@lombok.Data
public final class DetailPortMappingRuleResResult  {

    /**
     * <p>业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>端口映射规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleId")
    private String portMappingRuleId;

    /**
     * <p>端口映射的协议类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>源端口号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourcePort")
    private Integer sourcePort;

    /**
     * <p>已绑定实例数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalPods")
    private Integer totalPods;

    /**
     * <p>创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>更新时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private Long updateTime;

    /**
     * <p>方向类型。取值如下：</p>
     *
     * <p>- Inbound：入向</p>
     *
     * <p>- Bidirectional：双向</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Direction")
    private String direction;

    /**
     * <p>运营商。取值如下：</p>
     *
     * <p>- 1：移动</p>
     *
     * <p>- 2：联通</p>
     *
     * <p>- 4：电信</p>
     *
     * <p>- 7：三条运营商线路各开一个</p>
     *
     * <p>- 8：BGP</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private Integer isp;

    /**
     * <p>资源所在的物理区域，包含以下取值：</p>
     *
     *
     *
     * <p>- `inner`：中国大陆</p>
     *
     * <p>- `cn-hongkong-pop`：中国香港</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VolcRegion")
    private String volcRegion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
