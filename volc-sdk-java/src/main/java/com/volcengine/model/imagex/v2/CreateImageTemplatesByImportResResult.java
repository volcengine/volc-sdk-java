package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageTemplatesByImportResResult
 */
@lombok.Data
public final class CreateImageTemplatesByImportResResult  {

    /**
     * <p>导入结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImportResults")
    private List<CreateImageTemplatesByImportResResultImportResultsItem> importResults;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
