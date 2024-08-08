package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreatePortMappingRuleBody
 */
@lombok.Data
public final class CreatePortMappingRuleBody  {

    /**
     * <p>云手机业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>端口映射规则 ID，需确保规则 ID 全局唯一；如不指定，由系统随机生成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleId")
    private String portMappingRuleId;

    /**
     * <p>端口映射的协议类型，取值如下：</p>
     *
     *
     *
     * <p>- `tcp`：（默认） TCP 协议类型。</p>
     *
     * <p>- `udp`：UDP 协议类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>源端口号，您可根据自身业务需求，自定义配置端口号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourcePort")
    private Integer sourcePort;

    /**
     * <p>方向类型。取值如下：</p>
     *
     * <p>- Inbound：入向（默认）</p>
     *
     * <p>- Bidirectional：双向</p>
     *
     * <p>:::warning</p>
     *
     * <p>该参数目前仅在华北/石家庄、华东/扬州、华南/广州等部分机房节点支持设置，若有涉及，请联系技术支持团队确认。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Direction")
    private String direction;

    /**
     * <p>运营商信息。取值如下：</p>
     *
     * <p>- 1：移动（默认）</p>
     *
     * <p>- 2：联通</p>
     *
     * <p>- 4：电信</p>
     *
     * <p>- 7：三条运营商线路各开一个</p>
     *
     * <p>:::warning</p>
     *
     * <p>该参数目前仅在华北/石家庄、华东/扬州、华南/广州等部分机房节点支持设置，若有涉及，请联系技术支持团队确认。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private Integer isp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
