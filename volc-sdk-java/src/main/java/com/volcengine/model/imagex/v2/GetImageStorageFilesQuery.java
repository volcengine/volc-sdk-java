package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStorageFilesQuery
 */
@lombok.Data
public final class GetImageStorageFilesQuery  {

    /**
     * <p>服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>上一次列举返回的位置标记，作为本次列举的起点信息。默认值为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    /**
     * <p>一次查询列出的文件信息条目数，取值范围为[1,1000]。默认值为 10。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>指定需要查询文件的前缀，只有资源名匹配该前缀的文件会被列出。缺省时将返回所有文件信息。</p>
     *
     *
     *
     * <p>例如，一个存储服务中有三个文件，分别为 Example/imagex.png、Example/mov/a.avis 和 Example/mov/b.avis。若指定 `Prefix` 取值 `Example/`且指定 `Delimiter` 取值 `/`：则返回 Example/imagex.png，并在 `CommonPrefix` 里返回 Example/mov/。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>指定目录分隔符，默认值为 `/`。所有文件名字包含指定的前缀，第一次出现 `Delimiter` 字符之间的文件作为一组元素（即 `CommonPrefixe`）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Delimiter")
    private String delimiter;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
