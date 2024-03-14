package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResult
 */
@lombok.Data
public final class GetDomainConfigResResult  {

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>域名状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "status")
    private String status;

    /**
     * <p>是否开启自适应格式，取值如下所示：</p>
     *
     * <p>* `true`：开启自适应</p>
     *
     * <p>* `false`：关闭自适应</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "adaptfmt")
    private Boolean adaptfmt;

    /**
     * <p>是否开启集智瘦身，取值如下所示：</p>
     *
     * <p>* `true`：开启集智瘦身</p>
     *
     * <p>* `false`：关闭集智瘦身</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "do_slim")
    private Boolean doSlim;

    /**
     * <p>是否开启全球加速，取值如下所示：</p>
     *
     * <p>* `true`：开启全球加速</p>
     *
     * <p>* `false`：关闭全球加速</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "global_acceleration")
    private Boolean globalAcceleration;

    /**
     * <p>HTTP Header 配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "resp_hdrs")
    private List<GetDomainConfigResResultRespHdrsItem> respHdrs;

    /**
     * <p>HTTPS 配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "https_config")
    private GetDomainConfigResResultHttpsConfig httpsConfig;

    /**
     * <p>访问控制配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "access_control")
    private GetDomainConfigResResultAccessControl accessControl;

    /**
     * <p>域名锁定状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "lock_status")
    private GetDomainConfigResResultLockStatus lockStatus;

    /**
     * <p>页面优化设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "page_optimization")
    private GetDomainConfigResResultPageOptimization pageOptimization;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
