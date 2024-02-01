package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageTemplateResResult
 */
@lombok.Data
public final class DeleteImageTemplateResResult  {

    /**
     * <p>成功删除的模板名称。</p>
     *
     * <p>* 如果仅指定删除单个模板，若删除失败直接返回错误。</p>
     *
     * <p>* 如果指定删除多个模板，若全部删除失败则返回错误；否则将返回成功删除的模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TemplateNames")
    private List<String> templateNames;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
