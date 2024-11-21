package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAiGenerateTaskQuery
 */
@lombok.Data
public final class GetImageAiGenerateTaskQuery  {

    /**
     * <p>AIGC 任务 ID，您可通过调用[创建 AIGC 异步任务](https://www.volcengine.com/docs/508/1134013)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
