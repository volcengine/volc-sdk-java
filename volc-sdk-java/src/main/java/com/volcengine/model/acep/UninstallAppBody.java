package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UninstallAppBody
 */
@lombok.Data
public final class UninstallAppBody  {

    /**
     * <p>业务 ID。</p>
     *
     * <p>如不指定 `PodIdList` 及 `TagIdList`，则对业务下所有实例进行应用卸载。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>应用 ID，可通过调用 `ListApp` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>指定实例 ID 列表进行应用卸载。单次接口调用最多支持对 1000 个实例进行应用卸载。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>指定标签 ID 列表进行应用卸载。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagIdList")
    private List<String> tagIdList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
