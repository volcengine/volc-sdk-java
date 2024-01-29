package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateResponseHeaderBody
 */
@lombok.Data
public final class UpdateResponseHeaderBody  {

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>Resp Headers 配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "resp_hdrs")
    private List<UpdateResponseHeaderBodyRespHdrsItem> respHdrs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
