package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * DeleteTagBody
 */
@lombok.Data
public final class DeleteTagBody  {

    /**
     * <p>标签 ID 列表，可通过调用 `ListTag` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagIdList")
    private List<String> tagIdList;

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
