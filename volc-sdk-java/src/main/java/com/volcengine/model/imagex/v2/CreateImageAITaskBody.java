package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageAITaskBody
 */
@lombok.Data
public final class CreateImageAITaskBody  {

    /**
     * <p>服务 ID。若 `DataType` 取值 `uri`，则提交的图片 URI 列表需在该服务内。</p>
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
     * <p>需要提交的图片数据类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `uri`：指定 ServiceId 下存储 URI。</p>
     *
     * <p>- `url`：公网可访问的 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataType")
    private String dataType;

    /**
     * <p>待进行 AI 处理的图片 URI 或 URL 列表，其中 URI 不需要带 `tos-cn-i-***` 前缀，最多传入 10,000 张图片。传入图片的宽高、大小等要求请参看对应的[附加组件使用限制](https://www.volcengine.com/docs/508/1270839)。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>若 `DataType` 取值 `uri`，则待转码图片 URI 必须为指定服务 ID 下的存储 URI。您可通过调用 [GetImageUploadFiles](https://www.volcengine.com/docs/508/9392) 获取指定服务下全部的上传文件存储 URI。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataList")
    private List<String> dataList;

    /**
     * <p>任务回调配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackConf")
    private CreateImageAITaskBodyCallbackConf callbackConf;

    /**
     * <p>AI 图像处理模板参数，需要将 JSON 压缩并转义为字符串。根据您需要的图像处理功能，参看 [AI 图像处理模板](https://www.volcengine.com/docs/508/1515840)页面获取模板 ID 和参数信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowParameter")
    private String workflowParameter;

    /**
     * <p>AI 图像处理模板 ID。根据您需要的图像处理功能，参看 [AI 图像处理模板](https://www.volcengine.com/docs/508/1515840)页面获取模板 ID 和参数信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowTemplateId")
    private String workflowTemplateId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueueId")
    private String queueId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
