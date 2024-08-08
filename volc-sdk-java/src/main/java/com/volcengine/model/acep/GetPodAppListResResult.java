package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetPodAppListResResult
 */
@lombok.Data
public final class GetPodAppListResResult  {

    /**
     * <p>查询到的实例应用安装信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultPodAppInfo> row;

    /**
     * <p>查询结果总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
