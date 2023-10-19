package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigFlvParamVODParam
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigFlvParamVODParam  {

    /**
     * <p>是否使用 VOD 存储，默认为 false，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- false：不使用；</p>
     *
     * <p>- true：使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>视频点播（VOD）空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>工作流模版 ID，对于存储在点播的录制文件，会使用该工作流模版对视频进行处理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>直播录制文件存储到点播时的视频分类 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassificationID")
    private Integer classificationID;

    /**
     * <p>直播录制文件存储到点播时的存储类型。支持的取值及含义如下所示。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private Integer storageClass;

    /**
     * <p>录制文件的存储位置。默认存储位置格式为 `record/{PubDomain}/{App}/{Stream}/{StartTime}_{EndTime}`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
