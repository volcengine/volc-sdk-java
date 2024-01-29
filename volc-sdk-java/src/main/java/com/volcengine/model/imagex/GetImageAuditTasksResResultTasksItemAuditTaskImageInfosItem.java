package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAuditTasksResResultTasksItemAuditTaskImageInfosItem
 */
@lombok.Data
public final class GetImageAuditTasksResResultTasksItemAuditTaskImageInfosItem  {

    /**
     * <p>待审核图片的 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>自定义的区分图片的标识</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
