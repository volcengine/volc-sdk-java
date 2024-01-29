package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageTemplateBody
 */
@lombok.Data
public final class DeleteImageTemplateBody  {

    /**
     * <p>待删除模板名称，最大限制为 100。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取服务下所有图片模板](https://www.volcengine.com/docs/508/9386)获取所需的模板名称。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateNames")
    private List<String> templateNames;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
