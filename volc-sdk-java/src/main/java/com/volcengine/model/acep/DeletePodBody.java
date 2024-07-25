package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeletePodBody
 */
@lombok.Data
public final class DeletePodBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。指定该参数时，仅销毁单个实例。</p>
     *
     * <p>> 与 `PodIdList` 二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例 ID 列表，指定该参数时，批量销毁多个实例。支持批量操作的实例数上限为100。</p>
     *
     * <p>> 与 `pod_id` 二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>是否强制销毁实例：</p>
     *
     * <p>- true：支持开机状态下销毁实例。</p>
     *
     * <p>- false：默认，不强制销毁实例，如不填写，在开机状态调用本接口销毁实例时会失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ForceDestroyFlag")
    private Boolean forceDestroyFlag;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
