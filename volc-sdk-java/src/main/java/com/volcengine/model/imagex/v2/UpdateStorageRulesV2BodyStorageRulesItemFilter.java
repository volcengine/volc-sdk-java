package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStorageRulesV2BodyStorageRulesItemFilter
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItemFilter  {

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
     * <p>对象大小大于。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectSizeGreaterThan")
    private Integer objectSizeGreaterThan;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
