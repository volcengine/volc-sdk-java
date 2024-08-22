package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * CreatePodResResult
 */
@lombok.Data
public final class CreatePodResResult  {

    /**
     * <p>创建成功的实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>创建成功的实例 ID 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
