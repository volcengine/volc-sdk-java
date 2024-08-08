package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UpdatePodResourceApplyNumBody
 */
@lombok.Data
public final class UpdatePodResourceApplyNumBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例资源组 ID：</p>
     *
     * <p>- 如指定，则优先级大于 ConfigurationCode 和 Dc</p>
     *
     * <p>- 如不指定，则 ConfigurationCode 和 Dc 必填，由 ConfigurationCode + Dc 确定 ResourceSetId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceSetId")
    private String resourceSetId;

    /**
     * <p>云手机实例规格 ID，如未指定 ResourceSetId，则此项必填。</p>
     *
     * <p>- `ultimate`：旗舰型 </p>
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
     * <p>机房</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dc")
    private String dc;

    /**
     * <p>已订购实例总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyNum")
    private Long applyNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
