package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSettingsQuery
 */
@lombok.Data
public final class GetImageSettingsQuery  {

    /**
     * <p>应用 ID，您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppId。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>所属组件，缺省情况下表示获取基础配置列表。</p>
     *
     *
     *
     * <p>- 取值为`HEIF`时，表示获取 HEIF 解码库下配置列表；</p>
     *
     * <p>- 取值为`SR`时，表示获取客户端下配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
