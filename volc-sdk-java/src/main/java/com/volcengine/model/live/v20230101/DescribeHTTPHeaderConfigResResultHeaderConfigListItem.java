package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHTTPHeaderConfigResResultHeaderConfigListItem
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigResResultHeaderConfigListItem  {

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否保留原 Header 配置，取值及含义如下所示。</p>
     *
     * <p>- `0`：保留；</p>
     *
     * <p>- `1`：不保留。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockOriginal")
    private Integer blockOriginal;

    /**
     * <p>配置是否启用，取值及含义如下所示。</p>
     *
     * <p>- `true`：启用；</p>
     *
     * <p>- `false`：禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>域名的 HTTP Header 具体字段配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderDetailList")
    private List<DescribeHTTPHeaderConfigResResultHeaderConfigListItemHeaderDetailListItem> headerDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
