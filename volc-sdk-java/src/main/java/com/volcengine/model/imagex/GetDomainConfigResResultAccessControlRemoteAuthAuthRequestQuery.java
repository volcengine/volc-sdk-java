package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthRequestQuery
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthRequestQuery  {

    /**
     * <p>鉴权请求是否包含用户请求 URL 中的查询参数。取值如下所示：</p>
     *
     *
     *
     * <p>- `exclude`：表示鉴权请求不包含任何查询参数。</p>
     *
     * <p>- `include`：表示鉴权请求包含所有查询参数。</p>
     *
     * <p>- `includePart`：表示鉴权请求包含指定的查询参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    /**
     * <p>Action 参数所对应的参数值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    /**
     * <p>额外参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "query")
    private List<GetDomainConfigResResultAccessControlRemoteAuthAuthRequestQueryQueryItem> query;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
