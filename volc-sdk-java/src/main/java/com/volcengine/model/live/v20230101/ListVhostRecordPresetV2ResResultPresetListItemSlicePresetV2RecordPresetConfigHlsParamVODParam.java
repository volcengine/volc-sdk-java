package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigHlsParamVODParam
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigHlsParamVODParam  {

    /**
     * <p>是否使用 VOD 存储，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `false`：不使用；</p>
     *
     * <p>- `true`：使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>视频点播（VOD）空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>视频点播工作流模板 ID，对于存储在点播的录制文件，会使用该工作流模版对录制的视频进行处理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>直播录制文件存储到点播时的视频分类 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassificationID")
    private Integer classificationID;

    /**
     * <p>直播录制文件存储到点播时的存储类型，存储类型介绍请参考[媒资存储管理](https://www.volcengine.com/docs/4/73629#媒资存储)，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `1`：标准存储；</p>
     *
     * <p>- `2`：归档存储。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private Integer storageClass;

    /**
     * <p>录制文件的存储规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
