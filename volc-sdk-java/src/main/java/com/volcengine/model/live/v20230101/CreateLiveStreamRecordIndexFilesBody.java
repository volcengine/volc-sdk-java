package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveStreamRecordIndexFilesBody
 */
@lombok.Data
public final class CreateLiveStreamRecordIndexFilesBody  {

    /**
     * <p>直播流使用的域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>录制索引文件的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>旧参数实际只能传入格式是2006-01-02T16:04:05Z的时间，不是支持rfc3339。所以使用了新字段代替</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>录制索引文件的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>指定录制文件存储的 TOS Bucket。默认为空，表示与对应录制配置中的存储配置一致。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- `OutputBucket` 参数用于覆盖录制配置中的 TOS 存储的 `Bucket` 参数，`OutputObject` 参数用于覆盖录制配置中 TOS 存储的 `ExactObject` 参数。</p>
     *
     *
     *
     * <p>- 当您的录制配置存储位置为 VOD ，且创建录制任务仍需存储至 VOD 时，请勿配置 `OutputBucket` 和 `OutputObject`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputBucket")
    private String outputBucket;

    /**
     * <p>指定录制文件存储到 TOS 是的存储规则，默认为空，表示与对应录制配置中的存储规则配置一致。</p>
     *
     *
     *
     * <p>自定义存储规则时，支持以 `record/{PubDomain}/{App}/{Stream}/{StartTime}_{EndTime}.m3u8` 样式设置存储规则，支持输入字母（A - Z、a - z）、数字（0 - 9）、短横线（-）、叹号（!）、下划线（\_）、句点（.）、星号（\*）及占位符，最大长度 200 个字符。</p>
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
     * <p>- {PubDomain} 取值为当前配置的 `vhost` 值；</p>
     *
     * <p>- {App} 取值为当前配置的 `AppName` 值；</p>
     *
     * <p>- {Stream} 取值为当前配置的 `StreamName` 值；</p>
     *
     * <p>- {StartTime} 取值为录制的开始时间戳；</p>
     *
     * <p>- {EndTime} 取值为录制的结束时间戳；</p>
     *
     * <p>- 需设置文件后缀为`m3u8`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputObject")
    private String outputObject;

    /**
     * <p>是否开启获取录制视频宽高数据的功能，开启后会获取视频宽和高信息，支持的取值及含义如下所示，默认不传时表示开启。</p>
     *
     * <p>- `true`：开启；</p>
     *
     * <p>- `false`：禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedFFProbe")
    private Boolean needFFProbe;

    /**
     * <p>将录制文件存储到点播时，是否开启索引文件与 TS 文件分离，默认禁用。</p>
     *
     *
     *
     * <p>- `true`：启用，删除索引文件时不会删除关联的 TS 文件；</p>
     *
     * <p>- `false`：禁用，删除索引文件时会删除关联的 TS 文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SeparatedTS")
    private Boolean separatedTS;

    /**
     * <p>将录制文件存储到点播时，如需进行视频处理，可选择已定义的视频处理工作流模板，获取方法请参见[工作流模板](https://www.volcengine.com/docs/4/65675)，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>指定访问录制文件的地址中的网络协议，取值及含义如下所示。</p>
     *
     * <p>- `http`：超文本传输协议（默认值）；</p>
     *
     * <p>- `https`：安全的超文本传输协议。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TSScheme")
    private String tSScheme;

    /**
     * <p>录制索引文件的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTimeUTC")
    private String endTimeUTC;

    /**
     * <p>录制索引文件的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTimeUTC")
    private String startTimeUTC;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
