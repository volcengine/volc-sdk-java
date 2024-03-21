package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2BodyRecordPresetConfigFlvParamVODParam
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfigFlvParamVODParam  {

    /**
     * <p>是否使用 VOD 存储，默认为 `false`，取值及含义如下所示。</p>
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
     * <p>视频点播（VOD）空间名称。可登录[视频点播控制台](https://console.volcengine.com/vod/)查询。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果启用 VODParam 配置（`Enable` 取值为 `true`），则 `VodNamespace` 必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>视频点播工作流模板 ID，对于存储在点播的录制文件，会使用该工作流模版对录制的视频进行处理，可登录[视频点播控制台](https://console.volcengine.com/vod/)获取工作流模板 ID，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>直播录制文件存储到点播时的视频分类 ID，您可以通过视频点播的 [ListVideoClassifications](https://www.volcengine.com/docs/4/101661) 接口查询视频分类 ID 等信息，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassificationID")
    private Integer classificationID;

    /**
     * <p>直播录制文件存储到点播时的存储类型，存储类型介绍请参考[媒资存储管理](https://www.volcengine.com/docs/4/73629#媒资存储)。默认值为 `1`，支持的取值及含义如下所示。</p>
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
     * <p>录制文件的存储规则，最大长度为 200 个字符，支持以</p>
     *
     * <p>`record/{PubDomain}/{App}/{Stream}/{StartTime}_{EndTime}` 样式设置存储规则，支持输入字母（A - Z、a - z）、数字（0 - 9）、短横线（-）、叹号（!）、下划线（_）、句点（.）、星号（*）及占位符。</p>
     *
     *
     *
     * <p>存储规则设置注意事项如下。</p>
     *
     *
     *
     * <p>- 目录层级至少包含2级及以上，如 `live/{App}/{Stream}`。</p>
     *
     * <p>- record 为自定义字段；</p>
     *
     * <p>- {PubDomain} 取值为当前配置的 `vhost` 值；</p>
     *
     * <p>- {App} 取值为当前配置的 `AppName` 值；</p>
     *
     * <p>- {Stream} 取值为当前配置的 `StreamName` 值；</p>
     *
     * <p>- {StartTime} 取值为录制的开始时间戳；</p>
     *
     * <p>- {EndTime} 取值为录制的结束时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
