package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageServiceResResultStorageRulesV2Item
 */
@lombok.Data
public final class GetImageServiceResResultStorageRulesV2Item  {

    /**
     * <p>请提供参数的名字（Id）和类型（string），我会根据输入生成参数的一句话描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>参数的前缀和类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>事件类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Event")
    private String event;

    /**
     * <p>是否启用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>过滤条件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filter")
    private GetImageServiceResResultStorageRulesV2ItemFilter filter;

    /**
     * <p>过期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Expiration")
    private GetImageServiceResResultStorageRulesV2ItemExpiration expiration;

    /**
     * <p>非当前版本的过期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentVersionExpiration")
    private GetImageServiceResResultStorageRulesV2ItemNonCurrentVersionExpiration nonCurrentVersionExpiration;

    /**
     * <p>中止未完成的分段上传配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AbortIncompleteMultipartUpload")
    private GetImageServiceResResultStorageRulesV2ItemAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

    /**
     * <p>状态转换。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Transitions")
    private List<GetImageServiceResResultStorageRulesV2ItemTransitionsItem> transitions;

    /**
     * <p>非当前版本转换规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentVersionTransitions")
    private List<GetImageServiceResResultStorageRulesV2ItemNonCurrentVersionTransitionsItem> nonCurrentVersionTransitions;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
