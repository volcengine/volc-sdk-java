package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * RebootHostBody
 */
@lombok.Data
public final class RebootHostBody  {

    /**
     * <p>业务 ID。可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>云机 ID 列表。可通过调用 [ListHost](https://www.volcengine.com/docs/6394/1221480) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostIdList")
    private List<String> hostIdList;

    /**
     * <p>是否强制重启。取值如下：</p>
     *
     *
     *
     * <p>- `true`：（默认）不会将云机实例主动关机。</p>
     *
     * <p>- `false`：会将云机实例强制重启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Force")
    private Boolean force;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
