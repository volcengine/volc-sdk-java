package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAuditResultResResultResultsItem
 */
@lombok.Data
public final class GetImageAuditResultResResultResultsItem  {

    /**
     * <p>任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>审核结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndAt")
    private String endAt;

    /**
     * <p>该任务被指定的审核场景，取值如下所示：</p>
     *
     *
     *
     * <p>- `UrlFile`：上传 txt 审核文件处理场景</p>
     *
     * <p>- `Url`：上传审核图片 URL 处理场景</p>
     *
     * <p>- `Upload`：图片上传场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>表示 txt 审核文件的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>审核结果，取值如下所示：</p>
     *
     *
     *
     * <p>- `problem`：问题图片</p>
     *
     * <p>- `frozen`：冻结图片</p>
     *
     * <p>- `fail`：审核失败图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageType")
    private String imageType;

    /**
     * <p>审核建议，取值如下所示：</p>
     *
     *
     *
     * <p>- `nopass`：建议不通过</p>
     *
     * <p>- `recheck`：建议复审</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditSuggestion")
    private String auditSuggestion;

    /**
     * <p>审核发现图片问题类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Problems")
    private List<String> problems;

    /**
     * <p>条目 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    /**
     * <p>`HaveMore` 取值 `true` 时，即本次查询还有未列举到的任务时。`Marker` 作为起始条目位置标记，您需要在下一次查询时传入该值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Marker")
    private String marker;

    /**
     * <p>错误信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>该任务的审核能力。取值如下所示：</p>
     *
     *
     *
     * <p>- `0`：基础审核能力</p>
     *
     * <p>- `1`：智能审核能力</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ability")
    private Integer ability;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
