package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateAuthKeyBody
 */
@lombok.Data
public final class UpdateAuthKeyBody  {

    /**
     * <p>应用名称，默认为所有应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>鉴权详情，数量阈值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthDetailList")
    private List<UpdateAuthKeyBodyAuthDetailListItem> authDetailList;

    /**
     * <p>推/拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>鉴权状态。创建推拉流鉴权时，默认值为 false；更新推拉流鉴权时，缺省情况表示不修改推拉流鉴权状态。</p>
     *
     * <p>- false：关闭推拉流鉴权；</p>
     *
     * <p>- true：开启推拉流鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushPullEnable")
    private Boolean pushPullEnable;

    /**
     * <p>鉴权场景类型。</p>
     *
     * <p>- push：推流鉴权；</p>
     *
     * <p>- pull：拉流鉴权；</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    /**
     * <p>有效时长，单位为 s，默认值为 604800，取值范围为 [60,2592000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private Integer validDuration;

    /**
     * <p>域名空间名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
