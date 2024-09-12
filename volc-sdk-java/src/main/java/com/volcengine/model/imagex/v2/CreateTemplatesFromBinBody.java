package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateTemplatesFromBinBody
 */
@lombok.Data
public final class CreateTemplatesFromBinBody  {

    /**
     * <p>待恢复模板的名称。您可以通过调用[获取回收站中所有模板](https://www.volcengine.com/docs/508/132241)获取所需的模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateNames")
    private List<String> templateNames;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
