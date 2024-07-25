package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPublicPortInfo
 */
@lombok.Data
public final class ResultPublicPortInfo  {

    /**
     * <p>运营商。取值如下：</p>
     *
     *
     *
     * <p>- `1`：移动</p>
     *
     * <p>- `2`：联通</p>
     *
     * <p>- `4`：电信</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private Integer isp;

    /**
     * <p>公共 IP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicIp")
    private String publicIp;

    /**
     * <p>公共端口。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PublicPort")
    private Integer publicPort;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
