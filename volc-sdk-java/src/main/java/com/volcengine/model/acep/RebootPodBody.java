package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * RebootPodBody
 */
@lombok.Data
public final class RebootPodBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。指定该参数时，仅对单个实例执行重启操作。</p>
     *
     * <p>> 与 `PodIdList` 二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例 ID 列表，指定该参数时，对多个实例批量执行重启操作。支持批量操作的实例数上限为100。</p>
     *
     * <p>> 与 `PodId` 二选一。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>重启实例时设置的 IP 资源策略：</p>
     *
     *
     *
     * <p>- Persist：保持亲和性调度策略。</p>
     *
     * <p>	</p>
     *
     * <p>- NonPersist：进行非亲和性调度策略。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourcePolicy")
    private String resourcePolicy;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
