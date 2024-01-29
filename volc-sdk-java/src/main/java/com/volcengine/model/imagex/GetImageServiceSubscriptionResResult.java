package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceSubscriptionResResult
 */
@lombok.Data
public final class GetImageServiceSubscriptionResResult  {

    /**
     * <p>账号 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>开通后的实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstanceId")
    private String instanceId;

    /**
     * <p>购买的商品，仅返回参数`imagex`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Product")
    private String product;

    /**
     * <p>购买的商品配置，如`imagex.monthly.bandwidth`表示按月结算的带宽计费方式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Configuration")
    private String configuration;

    /**
     * <p>实例类型，取值如下所示：</p>
     *
     * <p>* 1：正式</p>
     *
     * <p>* 2：试用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstanceType")
    private Integer instanceType;

    /**
     * <p>生效开始时间，日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BeginTime")
    private String beginTime;

    /**
     * <p>生效结束时间，日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpiredTime")
    private String expiredTime;

    /**
     * <p>使用状态，取值如下所示：</p>
     *
     * <p>* 0：未运行</p>
     *
     * <p>* 1：运行中</p>
     *
     * <p>* 2：创建中</p>
     *
     * <p>* 3：更配中</p>
     *
     * <p>* 4：续费中</p>
     *
     * <p>* 5：退订中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BusinessStatus")
    private Integer businessStatus;

    /**
     * <p>实例状态，取值如下所示：</p>
     *
     * <p>* 0：创建中</p>
     *
     * <p>* 1：运行中</p>
     *
     * <p>* 2：创建失败</p>
     *
     * <p>* 3：已退订</p>
     *
     * <p>* 4：到期关停</p>
     *
     * <p>* 5：到期回收</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
