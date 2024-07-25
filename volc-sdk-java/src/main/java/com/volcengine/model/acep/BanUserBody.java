package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * BanUserBody
 */
@lombok.Data
public final class BanUserBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>封禁用户的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private String userId;

    /**
     * <p>封禁时长，单位：秒，取值范围为 \[60, 259290\]：</p>
     *
     *
     *
     * <p>- 若传入值为空或 0 表示允许用户重新连接云手机；</p>
     *
     * <p>	</p>
     *
     * <p>- 若传入值大于 0，且小于 60，自动调整为 60；</p>
     *
     * <p>	</p>
     *
     * <p>- 若传入值大于 259290，自动调整为 259290。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ForbiddenInterval")
    private Integer forbiddenInterval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
