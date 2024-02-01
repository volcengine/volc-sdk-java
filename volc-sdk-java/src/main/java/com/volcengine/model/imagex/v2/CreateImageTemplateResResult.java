package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageTemplateResResult
 */
@lombok.Data
public final class CreateImageTemplateResResult  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>创建的模板名称。如果基于原模板做模板名称的更新，则会生成一个新模板。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateName")
    private String templateName;

    /**
     * <p>模板的创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>不支持的 filter 处理参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Unsupported")
    private List<CreateImageTemplateResResultUnsupportedItem> unsupported;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
