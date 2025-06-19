package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * ApplyVpcUploadInfoQuery
 */
@lombok.Data
public final class ApplyVpcUploadInfoQuery  {

    /**
     * <p>服务 ID。</p>
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
     * <p>上传文件的存储 Key。默认使用随机生成的字符串作为存储 Key。</p>
     *
     *
     *
     * <p>存储 Key 详细命名规范请参看 [veImageX 存储 Key 通用字符规则](https://www.volcengine.com/docs/508/1458331)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreKey")
    private String storeKey;

    /**
     * <p>指定的上传文件路径。指定 `Prefix` 时，下发的存储 Key 为：`Prefix/{随机Key}.{FileExtension}`，拼接形成的存储 Key 需满足 [veImageX 存储 Key 通用字符规则](https://www.volcengine.com/docs/508/1458331)。</p>
     *
     *
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>仅当未指定 `StoreKeys` 时生效。</p>
     *
     * <p>:::</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>文件扩展名，最大长度限制为 20 个字节。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>仅当未指定 `StoreKeys` 时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileExtension")
    private String fileExtension;

    /**
     * <p>上传文件的 Content-Type 值。</p>
     *
     *
     *
     * <p>需确保指定值在服务维度的白名单内，否则无法成功上传，参看[上传 Content-Type 限制](https://www.volcengine.com/docs/508/1319948)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContentType")
    private String contentType;

    /**
     * <p>存储类型。</p>
     *
     *
     *
     * <p>- `STANDARD`：标准存储</p>
     *
     * <p>- `IA`：低频存储</p>
     *
     * <p>- `ARCHIVE_FR`：归档闪回存储</p>
     *
     * <p>- `ARCHIVE`：归档存储</p>
     *
     * <p>- `COLD_ARCHIVE`：冷归档存储</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private String storageClass;

    /**
     * <p>文件大小。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileSize")
    private Long fileSize;

    /**
     * <p>分片大小，单位为字节，默认值为 200 MB。</p>
     *
     * <p>当 `FileSize` 大于 `PartSize` 时，下发分片上传的 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PartSize")
    private Long partSize;

    /**
     * <p>是否开启重名文件覆盖上传，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：（默认）关闭</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>在指定 `Overwrite` 为 `true` 前，请确保您指定的 `ServiceId` 对应服务已[开启了覆盖上传](https://www.volcengine.com/docs/508/1119912)能力。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Overwrite")
    private Boolean overwrite;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
