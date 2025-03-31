package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateStorageRulesV2BodyStorageRulesItem
 */
@lombok.Data
public final class UpdateStorageRulesV2BodyStorageRulesItem  {

    /**
     * <p>规则名称，长度256以内</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>文件前缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Prefix")
    private String prefix;

    /**
     * <p>事件名称，目前仅支持upload</p>
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
    private UpdateStorageRulesV2BodyStorageRulesItemFilter filter;

    /**
     * <p>过期时间。过期后会删除文件。过期时间要小于Transitions中天数，另外不能与Transitions里混用Day与Date</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Expiration")
    private UpdateStorageRulesV2BodyStorageRulesItemExpiration expiration;

    /**
     * <p>多版本过期配置。过期后会删除旧版本文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentVersionExpiration")
    private UpdateStorageRulesV2BodyStorageRulesItemNonCurrentVersionExpiration nonCurrentVersionExpiration;

    /**
     * <p>中止未完成的分段上传配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AbortIncompleteMultipartUpload")
    private UpdateStorageRulesV2BodyStorageRulesItemAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

    /**
     * <p>存储沉降配置，要么全部days要么全部date，不能混合配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Transitions")
    private List<UpdateStorageRulesV2BodyStorageRulesItemTransitionsItem> transitions;

    /**
     * <p>非当前版本转换规则。要么全部days要么全部date，不能混合配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NonCurrentVersionTransitions")
    private List<UpdateStorageRulesV2BodyStorageRulesItemNonCurrentVersionTransitionsItem> nonCurrentVersionTransitions;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
