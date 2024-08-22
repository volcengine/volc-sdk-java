package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ResultPortMappingRule
 */
@lombok.Data
public final class ResultPortMappingRule  {

    /**
     * <p>端口映射状态。取值如下：</p>
     *
     *
     *
     * <p>- `256`：打开中</p>
     *
     * <p>- `257`：打开完成</p>
     *
     * <p>- `512`：关闭中</p>
     *
     * <p>- `513`：关闭完成</p>
     *
     * <p>- `768`：销毁中</p>
     *
     * <p>- `769`：销毁完成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>端口映射策略，取值如下：</p>
     *
     *
     *
     * <p>- `tcp`</p>
     *
     * <p>- `udp`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>端口映射对应公网 IP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicIp")
    private String publicIp;

    /**
     * <p>端口映射对应公网端口。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicPort")
    private Integer publicPort;

    /**
     * <p>端口映射源端口。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourcePort")
    private Integer sourcePort;

    /**
     * <p>对应端口映射规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleId")
    private String portMappingRuleId;

    /**
     * <p>公共端口信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicPortInfoList")
    private List<ResultPublicPortInfo> publicPortInfoList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
