package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultStorageRulesV2ItemFilter
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesV2ItemFilter  {

    /**
     * <p>小于等于条件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LessThanIncludeEqual")
    private String lessThanIncludeEqual;

    /**
     * <p>对象大小上限。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectSizeLessThan")
    private Integer objectSizeLessThan;

    /**
     * <p>是否包含大于等于。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GreaterThanIncludeEqual")
    private String greaterThanIncludeEqual;

    /**
     * <p>对象大小大于。取值范围为 `[ ]`，单位为，默认值为``。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectSizeGreaterThan")
    private Integer objectSizeGreaterThan;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
