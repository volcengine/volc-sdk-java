package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeAuthResResultAuthListItem
 */
@lombok.Data
public final class DescribeAuthResResultAuthListItem  {

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>鉴权详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthDetailList")
    private List<DescribeAuthResResultAuthListItemAuthDetailListItem> authDetailList;

    /**
     * <p>鉴权状态。</p>
     *
     * <p>- false：关闭推拉流鉴权；</p>
     *
     * <p>- true：开启推拉流鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthStatus")
    private Boolean authStatus;

    /**
     * <p>推/拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>鉴权场景类型。</p>
     *
     * <p>- push：推流鉴权；</p>
     *
     * <p>- pull：拉流鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    /**
     * <p>有效时长，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private Integer validDuration;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
