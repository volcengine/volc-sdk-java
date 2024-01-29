package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageAnalyzeTaskBody
 */
@lombok.Data
public final class UpdateImageAnalyzeTaskBody  {

    /**
     * <p>任务名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>任务描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    /**
     * <p>服务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>仅当`Type` 取值 `UriFile` 时，配置有效。</p>
     *
     * <p>模板名称，您可通过调用 [GetAllImageTemplates](https://www.volcengine.com/docs/508/9386) 获取服务下所有已创建的 `TemplateName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tpl")
    private String tpl;

    /**
     * <p>txt 评估文件的 Store URI，该文件需上传至指定服务对应存储中。</p>
     *
     *
     *
     * <p>- `Type` 取值 `UrlFile` 时，填写合法 URL</p>
     *
     * <p>- `Type` 取值 `UriFile` 时，填写指定服务的存储 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private List<String> resUri;

    /**
     * <p>仅当`Type` 取值 `UriFile` 时，配置有效。</p>
     *
     * <p>是否模拟模板每阶段输出，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是，一个模版中可以选择多种图像处理, 模拟输出时会将所有的处理逐步叠加并编码为最终图片格式运行并输出评估结果。</p>
     *
     * <p>- `false`：否。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EvalPerStage")
    private Boolean evalPerStage;

    /**
     * <p>待更新的任务 ID，您可以通过调用 [GetImageAnalyzeTasks](https://www.volcengine.com/docs/508/1160417) 获取指定地区全部离线评估任务详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
