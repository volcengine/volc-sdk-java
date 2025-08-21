package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAuditTaskBodyImageInfosItem
 */
@lombok.Data
public final class CreateImageAuditTaskBodyImageInfosItem  {

    /**
     * <p>待审核图片的 URL 地址，需满足公网可访问。当 `Type` 为 `Url` 时，通过该字段批量提交待审核图片的 URL 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>自定义标识，用于区分待审核图片 `ImageUri` 的唯一标识，建议根据实际业务需求设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
