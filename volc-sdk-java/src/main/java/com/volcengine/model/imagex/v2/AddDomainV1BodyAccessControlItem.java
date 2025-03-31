package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AddDomainV1BodyAccessControlItem
 */
@lombok.Data
public final class AddDomainV1BodyAccessControlItem  {

    /**
     * <p>Referer 配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "refer_link")
    private List<AddDomainV1BodyAccessControlItemReferLinkItem> referLink;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
