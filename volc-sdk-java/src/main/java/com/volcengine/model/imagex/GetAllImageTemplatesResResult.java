package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAllImageTemplatesResResult
 */
@lombok.Data
public final class GetAllImageTemplatesResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Templates")
    private List<GetAllImageTemplatesResResultTemplatesItem> templates;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
