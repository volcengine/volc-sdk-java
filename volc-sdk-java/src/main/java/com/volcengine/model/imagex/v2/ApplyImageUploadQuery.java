package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ApplyImageUploadQuery
 */
@lombok.Data
public final class ApplyImageUploadQuery  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>一次上传会话 Key。</p>
     *
     * <p>:::tip</p>
     *
     * <p>本接口上一次请求的`SessionKey`，可在重试时带上，作为服务端的再次选路时的一个参考。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionKey")
    private String sessionKey;

    /**
     * <p>上传文件的数量，将决定下发的 StoreUri 的数量，取值范围为[1,10]，默认为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadNum")
    private Integer uploadNum;

    /**
     * <p>上传文件的存储 Key。默认使用随机生成的字符串作为存储 Key。</p>
     *
     * <p>* 数组长度和`UploadNum`保持一致。</p>
     *
     * <p>* 不支持空格，如果中间有空格将会导致上传失败。</p>
     *
     * <p>* 不支持以/开头或结尾，不支持/连续出现，Key 值最大长度限制为 180 个字节。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅对于 veImageX 上传场景生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreKeys")
    private List<String> storeKeys;

    /**
     * <p>指定的上传文件路径。</p>
     *
     * <p>* 指定`Prefix`时，下发的存储 Key 为：`Prefix/{随机Key}{FileExtension}`，其中`Prefix + FileExtension`最大长度限制为 145 个字节。</p>
     *
     * <p>* 不支持以/开头或结尾，不支持/连续出现。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当未指定`StoreKeys`时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>文件扩展名(如：.java, .txt, .go 等)，最大长度限制为 8 个字节。</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当未指定`StoreKeys`时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileExtension")
    private String fileExtension;

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
     * <p>:::warning</p>
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
