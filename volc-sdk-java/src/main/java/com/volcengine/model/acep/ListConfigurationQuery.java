package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListConfigurationQuery
 */
@lombok.Data
public final class ListConfigurationQuery  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>配置资源类型：</p>
     *
     * <p>- 1：实例</p>
     *
     * <p>- 2：存储</p>
     *
     * <p>- 3：公网</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceClass")
    private Integer resourceClass;

    /**
     * <p>云机上运行的实例规格 ID，包含以下取值：</p>
     *
     *
     *
     * <p>- `ultimate`：旗舰型</p>
     *
     * <p>- `enhanced`：加强型</p>
     *
     * <p>- `common`：通用型</p>
     *
     * <p>- `sample`：入门型</p>
     *
     * <p>- `basic`：基础型</p>
     *
     * <p>- `elementary`：低配型</p>
     *
     * <p>- `ultimatePlus`：旗舰型Plus</p>
     *
     * <p>- `enhancedPlus`：加强型Plus</p>
     *
     * <p>- `commonPlus`：通用型Plus</p>
     *
     * <p>- `samplePlus`：入门型Plus</p>
     *
     * <p>- `basicPlus`：基础型Plus</p>
     *
     * <p>- `elementaryPlus`：低配型Plus</p>
     *
     *
     *
     * <p>本地存储方案除上述 12 种规格外，还包含以下 6 个取值：</p>
     *
     *
     *
     * <p>- `ultimatePro`：旗舰型Pro</p>
     *
     * <p>- `enhancedPro`：加强型Pro</p>
     *
     * <p>- `commonPro`：通用型Pro</p>
     *
     * <p>- `samplePro`：入门型Pro</p>
     *
     * <p>- `basicPro`：基础型Pro</p>
     *
     * <p>- `elementaryPro`：低配型Pro</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigurationCode")
    private String configurationCode;

    /**
     * <p>分页偏移量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>单页数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
