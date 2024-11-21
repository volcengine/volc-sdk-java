package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageElementsResResultImageListItem
 */
@lombok.Data
public final class GetImageElementsResResultImageListItem  {

    /**
     * <p>图片 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>要素添加时间，添加要素时的服务器当地时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AddAt")
    private String addAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
