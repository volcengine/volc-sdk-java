package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * CopyPodResResult
 */
@lombok.Data
public final class CopyPodResResult  {

    /**
     * <p>拷贝出的实例信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodList")
    private List<com.volcengine.model.acep.v20231030.ResultPodOverview> podList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
