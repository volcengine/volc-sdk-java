package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRecordPresetV2BodyRecordPresetConfigFlvParamTOSParam
 */
@lombok.Data
public final class UpdateRecordPresetV2BodyRecordPresetConfigFlvParamTOSParam  {

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
     * <p>录制文件存储到 TOS 时的存储路径和文件名规则。支持输入字母（A - Z、a - z）、数字（0 - 9）、短横线（-）、叹号（!）、下划线（_）、句点（.）、星号（*）及占位符。最大长度为 200 个字符，</p>
     *
     *
     *
     * <p>支持以下字段作为占位符：</p>
     *
     *
     *
     * <p>- `record`：自定义字段，可遵照支持字符进行自定义。</p>
     *
     * <p>- `{PubDomain}`：当前配置中的 vhost 值。</p>
     *
     * <p>- `{App}`：当前配置中的 AppName 值。</p>
     *
     * <p>- `{Stream}`：当前配置中的 StreamName 值。</p>
     *
     * <p>- `{StartTime}`：录制开始的 Unix 时间戳，精度为 s。</p>
     *
     * <p>- `{EndTime}`：录制结束的 Unix 时间戳，精度为 s。</p>
     *
     *
     *
     * <p>存储路径必须至少包含两级目录。例如：`live/{App}/{Stream}`</p>
     *
     *
     *
     * <p>**合法示例：**</p>
     *
     * <p>```plaintext</p>
     *
     * <p>record/{PubDomain}/{App}/{Stream}/{StartTime}-{EndTime} </p>
     *
     * <p>{App}/archive/{Stream}/recording_{StartTime} </p>
     *
     * <p>vod/{Stream}/!highlight_{EndTime}</p>
     *
     * <p>a/b/custom_record  </p>
     *
     * <p>```</p>
     *
     * <p>**错误示例：**</p>
     *
     * <p>```plaintext</p>
     *
     * <p>single_level              # 错误：路径层级不足两级  </p>
     *
     * <p>invalid_/{S@ream}/file    # 错误：含非法字符@  </p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
