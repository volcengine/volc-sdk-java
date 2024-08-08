package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AttachTagBody
 */
@lombok.Data
public final class AttachTagBody  {

    /**
     * <p>标签 ID，可通过调用 `ListTag` 接口获取，空值为删除实例已绑定标签。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagId")
    private String tagId;

    /**
     * <p>实例 ID 列表，可通过 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
