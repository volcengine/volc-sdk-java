package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetTemplatesFromBinResResult
 */
@lombok.Data
public final class GetTemplatesFromBinResResult  {

    /**
     * <p>模板总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>所有模板信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Templates")
    private List<GetTemplatesFromBinResResultTemplatesItem> templates;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
