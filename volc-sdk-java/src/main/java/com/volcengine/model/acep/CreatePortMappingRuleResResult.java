package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreatePortMappingRuleResResult
 */
@lombok.Data
public final class CreatePortMappingRuleResResult  {

    /**
     * <p>端口映射的规则 ID。</p>
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
     * <p>端口映射规则创建时间，Unix 时间戳，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
