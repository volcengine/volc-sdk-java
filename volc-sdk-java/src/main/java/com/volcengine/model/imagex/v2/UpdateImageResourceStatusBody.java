package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageResourceStatusBody
 */
@lombok.Data
public final class UpdateImageResourceStatusBody  {

    /**
     * <p>资源的封禁状态，取值如下所示：</p>
     *
     *
     *
     * <p>- `disable`：禁用。禁用状态，您无法访问该资源。</p>
     *
     * <p>- `enable`：启用。启用状态，您可正常访问该资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>待修改封禁状态的资源存储 Key（不携带 Bucket 信息），可在控制台资源管理页面查看。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectName")
    private String objectName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
