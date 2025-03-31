package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AIProcessBody
 */
@lombok.Data
public final class AIProcessBody  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>* 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>* 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>AI 图像处理模板 ID。根据您需要的图像处理功能，参看 [AI 图像处理模板](https://www.volcengine.com/docs/508/1515840)页面获取模板 ID 和参数信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowTemplateId")
    private String workflowTemplateId;

    /**
     * <p>AI 图像处理模板参数，需要将 JSON 压缩并转义为字符串。根据您需要的图像处理功能，参看 [AI 图像处理模板](https://www.volcengine.com/docs/508/1515840)页面获取模板 ID 和参数信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowParameter")
    private String workflowParameter;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
