package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryValsQuery
 */
@lombok.Data
public final class GetImageXQueryValsQuery  {

    /**
     * <p>自定义维度名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取自定义维度列表](https://www.volcengine.com/docs/508/34554)获取所需的维度名称。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dim")
    private String dim;

    /**
     * <p>数据来源。</p>
     *
     * <p>* `upload`：上传 1.0 数据。</p>
     *
     * <p>* `cdn`：下行网络数据。</p>
     *
     * <p>* `client`：客户端数据。</p>
     *
     * <p>* `sensible`：感知数据。</p>
     *
     * <p>* `uploadv2`：上传 2.0 数据。</p>
     *
     * <p>* `exceed`：大图监控数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private String source;

    /**
     * <p>应用 ID。默认为空，匹配中账号下所有的 App ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppID。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Appid")
    private String appid;

    /**
     * <p>需要匹配的系统类型，不传则匹配非 WEB 端的所有系统。取值如下所示：</p>
     *
     * <p>- `iOS`</p>
     *
     * <p>- `Android`</p>
     *
     * <p>- `WEB`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
