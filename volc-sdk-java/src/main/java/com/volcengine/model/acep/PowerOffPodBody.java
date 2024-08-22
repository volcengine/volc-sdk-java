package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * PowerOffPodBody
 */
@lombok.Data
public final class PowerOffPodBody  {

    /**
     * <p>实例所归属的业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，指定该参数时，仅对单个实例执行关机操作。</p>
     *
     * <p>> 与 `PodIdList` 二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例 ID 列表，指定该参数时，对多个实例批量执行关机操作。支持批量操作的实例数上限为 100。</p>
     *
     * <p>> 与 `PodId` 二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
