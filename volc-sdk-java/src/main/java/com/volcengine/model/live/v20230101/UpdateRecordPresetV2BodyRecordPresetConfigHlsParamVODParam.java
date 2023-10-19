package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRecordPresetV2BodyRecordPresetConfigHlsParamVODParam
 */
@lombok.Data
public final class UpdateRecordPresetV2BodyRecordPresetConfigHlsParamVODParam  {

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
     * <p>视频点播（VOD）空间名称。可登录[视频点播控制台](https://console.volcengine.com/vod/)查询</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果 VODParam 中的 Enable 取值为 true，则 VodNamespace 必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>工作流模版 ID，对于存储在点播的录制文件，会使用该工作流模版对视频进行处理。可登录[视频点播控制台](https://console.volcengine.com/vod/)获取 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>直播录制文件存储到点播时的视频分类 ID，您可以通过视频点播的 [ListVideoClassifications](https://www.volcengine.com/docs/4/101661) 接口查询视频分类 ID 等信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClassificationID")
    private Integer classificationID;

    /**
     * <p>直播录制文件存储到点播时的存储类型。默认值为 1，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- 1：标准存储；</p>
     *
     * <p>- 2：归档存储。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageClass")
    private Integer storageClass;

    /**
     * <p>录制文件的存储位置，最大长度为 200 个字符。默认的存储位置为 `record/{PubDomain}/{App}/{Stream}/{StartTime}_{EndTime}` ，参数格式要求如下所示。</p>
     *
     *
     *
     * <p>- 支持删除固定路径，如 {App}/{Stream}；</p>
     *
     * <p>- 不支持以正斜线（/）或者反斜线（\\）开头；</p>
     *
     * <p>- 不支持 “//” 和 “/./” 等字符串；</p>
     *
     * <p>- 不支持 \\b、\\t、\\n、\\v、\\f、\\r 等字符；</p>
     *
     * <p>- 不支持 “..” 作为文件名；</p>
     *
     * <p>- 目录层级至少包含 2 级及以上，如 `live/{App}/{Stream}`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
