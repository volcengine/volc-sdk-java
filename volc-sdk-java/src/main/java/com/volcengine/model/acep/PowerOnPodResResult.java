package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * PowerOnPodResResult
 */
@lombok.Data
public final class PowerOnPodResResult  {

    /**
     * <p>火山引擎账号 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>实例所归属的业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例开机操作结果详情，参考以下 `PodActionResult` 数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Details")
    private List<com.volcengine.model.acep.v20231030.ResultPodActionResult> details;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
