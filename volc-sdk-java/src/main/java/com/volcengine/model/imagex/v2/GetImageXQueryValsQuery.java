package com.volcengine.model.imagex.v2;


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
     * <p>您可以通过调用[获取自定义维度列表](https://www.volcengine.com/docs/508/1213048)获取所需的维度名称。</p>
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
     * <p>* `exceed`：大图监控数据，包含大图样本量和大图明细。</p>
     *
     * <p>* `exceed_all`：大图分布数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Source")
    private String source;

    /**
     * <p>应用 ID。默认为空，匹配中账号下所有的 AppID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/1213042)的方式获取所需的 AppID。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Appid")
    private String appid;

    /**
     * <p>需要匹配的系统类型。取值如下所示：</p>
     *
     * <p>- 不传或传空字符串：Android+iOS。</p>
     *
     * <p>- `iOS`：iOS。</p>
     *
     * <p>- `Android`：Android。</p>
     *
     * <p>- `WEB`：web+小程序。</p>
     *
     * <p>- `Web`：web，仅当`Source`为`upload`或`uploadv2`时可传。</p>
     *
     * <p>- `Imp`：小程序，仅当`Source`为`upload`或`uploadv2`时可传。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    /**
     * <p>需要过滤的关键词（包含），不传则不过滤关键词。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Keyword")
    private String keyword;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
