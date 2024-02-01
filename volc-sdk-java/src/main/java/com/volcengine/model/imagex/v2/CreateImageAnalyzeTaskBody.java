package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageAnalyzeTaskBody
 */
@lombok.Data
public final class CreateImageAnalyzeTaskBody  {

    /**
     * <p>自定义离线评估任务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务描述，可作为该条任务的备注信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>任务类型。取值如下所示：</p>
     *
     * <p>- OnlineUrl（暂不支持）</p>
     *
     * <p>- SdkUrl（暂不支持）</p>
     *
     * <p>- `UrlFile`：在线提交 URL 离线评估，即在.txt 文件（评估文件）内填写了待评估图片文件 URL，并将该 txt 文件上传至指定服务后获取并传入该文件的 StoreUri。</p>
     *
     * <p>- `UriFile`：在线提交 URI 离线评估，即在.txt 文件（评估文件）内填写了待评估图片文件 URI，并将该 txt 文件上传至指定服务后获取并传入该文件的 StoreUri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

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
     * <p>仅当`Type` 取值 `UriFile` 时，配置有效。</p>
     *
     * <p>模板名称，您可通过调用 [GetAllImageTemplates](https://www.volcengine.com/docs/508/9386) 获取服务下所有已创建的 `TemplateName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tpl")
    private String tpl;

    /**
     * <p>txt 评估文件的 Store URI，该文件需上传至指定服务对应存储中。</p>
     *
     * <p>- `Type` 取值 `UrlFile` 时，填写合法 URL</p>
     *
     * <p>- `Type` 取值 `UriFile` 时，填写指定服务的存储 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private List<String> resUri;

    /**
     * <p>仅当`Type` 取值 `UriFile` 时，配置有效。</p>
     *
     * <p>是否模拟模板每阶段输出，取值如下所示：</p>
     *
     * <p>- `true`：是，一个模版中可以选择多种图像处理, 模拟输出时会将所有的处理逐步叠加并编码为最终图片格式运行并输出评估结果。</p>
     *
     * <p>- `false`：否。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EvalPerStage")
    private Boolean evalPerStage;

    /**
     * <p>任务地区。当前仅支持取值 `cn`，表示国内。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
