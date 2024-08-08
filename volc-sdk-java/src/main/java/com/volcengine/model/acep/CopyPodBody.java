package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CopyPodBody
 */
@lombok.Data
public final class CopyPodBody  {

    /**
     * <p>实例所归属的业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>源实例 ID，可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>拷贝出的实例名称。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>多个实例的命名规则为 在 pod_name 基础上添加后缀 _i，i 代表第 i 个实例。例如：pod_name_1、pod_name_2、... pod_name_n</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    /**
     * <p>拷贝出的实例是否立即开机。取值如下：</p>
     *
     *
     *
     * <p>- `true`：立即开机。</p>
     *
     * <p>- `false`：（默认）关机。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Active")
    private Boolean active;

    /**
     * <p>需要拷贝出的实例数量。取值范围为 (0,100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Num")
    private Integer num;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
