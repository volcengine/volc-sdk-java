package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListDomainDetailResResultDomainListItemTagsItem
 */
@lombok.Data
public final class ListDomainDetailResResultDomainListItemTagsItem  {

    /**
     * <p>标签 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>标签 value。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    /**
     * <p>分类。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
