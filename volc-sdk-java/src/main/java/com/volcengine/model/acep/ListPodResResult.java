package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPodResResult
 */
@lombok.Data
public final class ListPodResResult  {

    /**
     * <p>列表行信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultPod> row;

    /**
     * <p>总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
