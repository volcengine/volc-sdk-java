package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * FetchImageUrlBody
 */
@lombok.Data
public final class FetchImageUrlBody  {

    /**
     * <p>待抓取上传的文件 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>目标服务 ID，迁移后的文件将上传至该服务绑定的存储。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>指定存储 key，不包含 bucket 部分。默认使用随机生成的 key。</p>
     *
     * <p>:::tip</p>
     *
     * <p>若指定 key 已存在，则会覆盖服务中 StoreKey 对应的已有文件，此时服务中保存文件的数量未发生变化。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreKey")
    private String storeKey;

    /**
     * <p>请求 header</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestHeader")
    private Map<String, List<String>> requestHeader;

    /**
     * <p>资源下载超时时间。</p>
     *
     *
     *
     * <p>- 同步处理下最大超时为 20 秒；</p>
     *
     * <p>- 异步处理下最大超时为 90 秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeOut")
    private Integer timeOut;

    /**
     * <p>是否采用异步，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：采用异步</p>
     *
     * <p>- `false`：（默认）不采用异步</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>若您的资源大小小于 5 G，但预估资源迁移超时时间超过 20 s，建议您选择异步处理。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Async")
    private Boolean async;

    /**
     * <p>迁移资源的 IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Host")
    private String host;

    /**
     * <p>回调 URL，veImageX 以 Post 方式向业务服务器发送 JSON 格式回调数据。当`Async`取值为`true`，即采用异步处理时，为必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>校验下载文件的 MD5，若校验不一致则停止文件的上传。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MD5")
    private String mD5;

    /**
     * <p>透传给业务的回调内容，当`Callback`不为空时为必填，取值需要符合`CallbackBodyType`指定格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBodyType")
    private String callbackBodyType;

    /**
     * <p>透传给业务的回调内容格式。当`CallbackBody`不为空时为必填。取值如下所示：</p>
     *
     *
     *
     * <p>- `application/json`</p>
     *
     * <p>- `application/x-www-form-urlencoded`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBody")
    private String callbackBody;

    /**
     * <p>回调时使用的 IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackHost")
    private String callbackHost;

    /**
     * <p>服务存储中存在相同的存储 key 时，是否忽略本次迁移操作。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：忽略本次迁移操作。</p>
     *
     * <p>- `false`：（默认）继续迁移并覆盖相同 key 的资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IgnoreSameKey")
    private Boolean ignoreSameKey;

    /**
     * <p>文件在抓取时，是否不执行解码操作，取值如下所示：</p>
     *
     * <p>- `true`：文件仅下载上传，不执行解码操作。</p>
     *
     * <p>- `false`：（默认）文件在下载上传同时执行解码操作。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FetchOnly")
    private Boolean fetchOnly;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
