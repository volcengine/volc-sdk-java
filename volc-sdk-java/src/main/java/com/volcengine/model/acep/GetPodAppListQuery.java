package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetPodAppListQuery
 */
@lombok.Data
public final class GetPodAppListQuery  {

    /**
     * <p>实例所属业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>筛选条件，应用安装状态，可选项：</p>
     *
     *
     *
     * <p>- `513`：正在安装 </p>
     *
     * <p>- `516`：正在下载 </p>
     *
     * <p>- `528`：安装完成 </p>
     *
     * <p>- `1024`：安装失败 </p>
     *
     * <p>- `1280`：卸载中 </p>
     *
     * <p>- `1281`：已卸载</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstallStatus")
    private Integer installStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
