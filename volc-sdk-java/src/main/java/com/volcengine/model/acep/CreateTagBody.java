package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreateTagBody
 */
@lombok.Data
public final class CreateTagBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>标签名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagName")
    private String tagName;

    /**
     * <p>标签描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagDesc")
    private String tagDesc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
