package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllImageServicesResResultServicesItemResourceLimitedVisit
 */
@lombok.Data
public final class GetAllImageServicesResResultServicesItemResourceLimitedVisit  {

    /**
     * <p>资源封禁开关，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>域名白名单列表，封禁资源仅可被白名单的域名访问。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowDomains")
    private List<String> allowDomains;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
