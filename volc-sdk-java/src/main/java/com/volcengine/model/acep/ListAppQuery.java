package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListAppQuery
 */
@lombok.Data
public final class ListAppQuery  {

    /**
     * <p>业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>筛选条件，应用 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>筛选条件，应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppName")
    private String appName;

    /**
     * <p>分页偏移量，默认为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小，默认值为 10，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    /**
     * <p>应用类型：</p>
     *
     *
     *
     * <p>- `0`：其他</p>
     *
     * <p>- `1`：视频</p>
     *
     * <p>- `2`：游戏</p>
     *
     * <p>- `3`：效率</p>
     *
     * <p>- `4`：办公</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppType")
    private Integer appType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
