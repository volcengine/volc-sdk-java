package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageTemplatesByImportBody
 */
@lombok.Data
public final class CreateImageTemplatesByImportBody  {

    /**
     * <p>模板导入的目标服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>模板名称冲突时是否重命名（增加版本号）。</p>
     *
     * <p>- `true`：是，有重名模板时，将对其增加版本号后再导入。</p>
     *
     * <p>- `false`：（默认）否。将忽略重名模板，不执行导入。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rename")
    private Boolean rename;

    /**
     * <p>待导入的模板 JSON 内容列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Templates")
    private List<String> templates;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
