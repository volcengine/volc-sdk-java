package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultPodDc
 */
@lombok.Data
public final class ResultPodDc  {

    /**
     * <p>机房。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private Integer isp;

    /**
     * <p>机房名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcName")
    private String dcName;

    /**
     * <p>区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
