package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListDomainDetailResResultDomainListItemTagsItem
 */
@lombok.Data
public final class ListDomainDetailResResultDomainListItemTagsItem  {

    /**
     * <p>标签 Key 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>标签 Value 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    /**
     * <p>标签类型。</p>
     *
     * <p>- System：系统内置标签</p>
     *
     * <p>- Custom：自定义标签</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
