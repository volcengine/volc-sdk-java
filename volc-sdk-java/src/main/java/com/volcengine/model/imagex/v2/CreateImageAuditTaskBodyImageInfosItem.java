package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAuditTaskBodyImageInfosItem
 */
@lombok.Data
public final class CreateImageAuditTaskBodyImageInfosItem  {

    /**
     * <p>待审核图片 URL，需满足公网可访问。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>建议您根据实际业务情况，将该参数作为可区分审核图片 `ImageUri` 的自定义标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
