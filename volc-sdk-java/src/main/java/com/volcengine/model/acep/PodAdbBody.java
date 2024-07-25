package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * PodAdbBody
 */
@lombok.Data
public final class PodAdbBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>开启或关闭实例的 ADB 连接功能：</p>
     *
     *
     *
     * <p>- true: 打开 ADB。</p>
     *
     * <p>	</p>
     *
     * <p>- false: 关闭 ADB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
