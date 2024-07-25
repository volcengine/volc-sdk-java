package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultConfiguration
 */
@lombok.Data
public final class ResultConfiguration  {

    /**
     * <p>内存大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Memory")
    private Double memory;

    /**
     * <p>cpu核数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CpuCore")
    private Double cpuCore;

    /**
     * <p>云机规格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

    /**
     * <p>云手机实例规格 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    /**
     * <p>云手机实例规格名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationName")
    private String configurationName;

    /**
     * <p>配置类型。取值如下：</p>
     *
     *
     *
     * <p>- `1`：正式</p>
     *
     * <p>- `2`：试用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationType")
    private Integer configurationType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
