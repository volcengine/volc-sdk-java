package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAuditTasksResResultTasksItemAuditTask
 */
@lombok.Data
public final class GetImageAuditTasksResResultTasksItemAuditTask  {

    /**
     * <p>审核能力，取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：基础审核能力</p>
     *
     * <p>- `1`：智能审核能力</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditAbility")
    private Integer auditAbility;

    /**
     * <p>指定的冻结措施，取值如下所示：</p>
     *
     *
     *
     * <p>- `recheck`：建议复审</p>
     *
     * <p>- `nopass`：审核不通过</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeType")
    private List<String> freezeType;

    /**
     * <p>指定的冻结维度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeDimensions")
    private List<String> freezeDimensions;

    /**
     * <p>是否开启冻结，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableFreeze")
    private Boolean enableFreeze;

    /**
     * <p>指定的审核维度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDimensions")
    private List<String> auditDimensions;

    /**
     * <p>指定的回调类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDimensions")
    private List<String> callbackDimensions;

    /**
     * <p>是否开启回调，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableCallback")
    private Boolean enableCallback;

    /**
     * <p>冻结策略，当前仅支持取 `0`，表示禁用图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FreezeStrategy")
    private Integer freezeStrategy;

    /**
     * <p>指定的回调 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackUrl")
    private String callbackUrl;

    /**
     * <p>回调图片类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `normal`：正常图片</p>
     *
     * <p>- `problem`：问题图片</p>
     *
     * <p>- `frozen`：冻结图片</p>
     *
     * <p>- `fail`：审核失败图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackImageTypes")
    private List<String> callbackImageTypes;

    /**
     * <p>仅当 `Type` 取值 `Upload` 时，有返回值。</p>
     *
     * <p>审核范围，取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：不限范围</p>
     *
     * <p>- `1`：指定范围</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableAuditRange")
    private Integer enableAuditRange;

    /**
     * <p>仅当 `EnableAuditRange` 取值 `1` 时，有返回值。表示指定不审核的目录前缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NoAuditPrefix")
    private List<String> noAuditPrefix;

    /**
     * <p>仅当 `EnableAuditRange` 取值 `1` 时，有返回值。表示指定审核的目录前缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditPrefix")
    private List<String> auditPrefix;

    /**
     * <p>审核中的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProcessedNumber")
    private Long processedNumber;

    /**
     * <p>审核失败的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedCount")
    private Long failedCount;

    /**
     * <p>审核成功的图片数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessCount")
    private Long successCount;

    /**
     * <p>仅当 Type 取值 Url 时，有返回值。表示上传的待审核图片 Url 列表详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageInfos")
    private List<GetImageAuditTasksResResultTasksItemAuditTaskImageInfosItem> imageInfos;

    /**
     * <p>指定的智能安全审核类型下图片文本审核维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditTextDimensions")
    private List<String> auditTextDimensions;

    /**
     * <p>是否开启大图审核，取值如下所示：  </p>
     *
     * <p>- `true`：开启 </p>
     *
     * <p>- `false`：不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableLargeImageDetect")
    private Boolean enableLargeImageDetect;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
