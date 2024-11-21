package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AddDomainV1Body
 */
@lombok.Data
public final class AddDomainV1Body  {

    /**
     * <p>域名，您可以通过调用 [获取服务下全部域名](https://www.volcengine.com/docs/508/9379) 获取当前服务下所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>证书配置，海外加速或者全球加速为必选，否则审核不通过。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "https")
    private List<AddDomainV1BodyHttpsItem> https;

    /**
     * <p>访问控制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "access_control")
    private List<AddDomainV1BodyAccessControlItem> accessControl;

    /**
     * <p>请求需要添加的响应头</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "resp_hdrs")
    private List<AddDomainV1BodyRespHdrsItem> respHdrs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
