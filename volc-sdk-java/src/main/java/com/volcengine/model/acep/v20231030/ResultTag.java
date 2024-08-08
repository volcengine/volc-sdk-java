package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultTag
 */
@lombok.Data
public final class ResultTag  {

    /**
     * <p>标签 ID，全局唯一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagId")
    private String tagId;

    /**
     * <p>标签关联的实例数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodNum")
    private Long podNum;

    /**
     * <p>标签描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagDesc")
    private String tagDesc;

    /**
     * <p>标签名称，全局唯一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagName")
    private String tagName;

    /**
     * <p>业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
