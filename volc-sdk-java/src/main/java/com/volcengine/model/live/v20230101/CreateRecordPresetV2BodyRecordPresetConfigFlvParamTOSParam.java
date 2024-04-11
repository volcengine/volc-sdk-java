package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2BodyRecordPresetConfigFlvParamTOSParam
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfigFlvParamTOSParam  {

    /**
     * <p>是否使用 TOS 存储，默认为 `false`，取值及含义如下所示。</p>
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
     * <p>TOS 存储对应的 Bucket。例如，存储位置为 live-test-tos-example/live/liveapp 时，`Bucket` 取值为 `live-test-tos-example`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果使用 TOS 存储，即 `TOSParam` 中 `Enable` 取值为 `true` 时，`Bucket` 为必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>TOS 存储对应 Bucket 下的存储目录，默认为空。例如，存储位置为 live-test-tos-example/live/liveapp 时，`StorageDir` 取值为 `live/liveapp`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

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
