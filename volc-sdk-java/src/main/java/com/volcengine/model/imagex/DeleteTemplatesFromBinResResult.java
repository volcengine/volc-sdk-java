package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteTemplatesFromBinResResult
 */
@lombok.Data
public final class DeleteTemplatesFromBinResResult  {

    /**
     * <p>成功删除的模板名称。</p>
     *
     * <p>* 如果指定为单个模板，删除失败直接返回错误。</p>
     *
     * <p>* 如果指定多个模板，如果全部删除失败则返回错误；否则返回成功删除的模板。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateNames")
    private List<String> templateNames;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
