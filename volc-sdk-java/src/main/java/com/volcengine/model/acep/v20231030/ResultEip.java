package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultEip
 */
@lombok.Data
public final class ResultEip  {

    /**
     * <p>运营商，1: 中国移动  2: 中国联通 4:中国电信 8：静态BGP</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private Integer isp;

    /**
     * <p>eip ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EipId")
    private String eipId;

    /**
     * <p>eip地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EipAddress")
    private String eipAddress;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
