package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageTranscodeTaskBody
 */
@lombok.Data
public final class CreateImageTranscodeTaskBody  {

    /**
     * <p>任务队列名称 ID。缺省情况下提交至账号默认任务队列。您可通过调用[GetImageTranscodeQueues](https://www.volcengine.com/docs/508/1107341)获取该账号下全部任务队列 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    /**
     * <p>服务 ID。若`DataType`取值`uri`，则提交的图片 URI 列表需在该服务可访问范围内。</p>
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
     * <p>转码模板。您可通过调用 [GetAllImageTemplates](https://www.volcengine.com/docs/508/9386) 获取指定服务下全部模版信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Template")
    private String template;

    /**
     * <p>数据类型，取值如下所示：</p>
     *
     *
     *
     * <p>- uri</p>
     *
     * <p>- url</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataType")
    private String dataType;

    /**
     * <p>待转码的图片 uri 或 url 列表。</p>
     *
     * <p>`DataList`和`Filelist`都不为空时，`DataList`优先生效。</p>
     *
     * <p>:::warning</p>
     *
     * <p>若`DataType`取值`uri`，则待转码图片 URI 必须为指定ServiceId下的存储 URI。您可通过调用 [GetImageUploadFiles](https://www.volcengine.com/docs/508/9392) 获取指定服务下全部的上传文件存储 URI。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataList")
    private List<String> dataList;

    /**
     * <p>待转码的图片 uri 或 url 文件列表。</p>
     *
     * <p>`DataList`和`Filelist`都不为空时，`DataList`优先生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileList")
    private List<String> fileList;

    /**
     * <p>转码产物的 Storekey 列表，仅当`DataList`不为空时有效，长度需与`DataList`长度一致。不传时默认使用固定规则生成产物的 Storekey。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResKeyList")
    private List<String> resKeyList;

    /**
     * <p>转码是否保留 exif。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：保留</p>
     *
     * <p>- `false`：（默认）不保留</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableExif")
    private Boolean enableExif;

    /**
     * <p>任务回调配置。缺省情况下默认使用队列回调配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private CreateImageTranscodeTaskBodyCallbackConf callbackConf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
