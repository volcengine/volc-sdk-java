package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultIpInfo
 */
@lombok.Data
public final class ResultIpInfo  {

    /**
     * <p>IP 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IP")
    private String iP;

    /**
     * <p>运营商：</p>
     *
     * <p>- 1：移动；</p>
     *
     * <p>- 2：联通；</p>
     *
     * <p>- 4：电信；</p>
     *
     * <p>- 8：BGP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private Integer iSP;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
