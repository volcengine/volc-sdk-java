package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRecordPresetV2BodyRecordPresetConfigFlvParam
 */
@lombok.Data
public final class UpdateRecordPresetV2BodyRecordPresetConfigFlvParam  {

    /**
     * <p>当前格式的录制是否开启，默认 `false`，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `false`：不开启；</p>
     *
     * <p>- `true`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>断流录制场景下，单文件录制时长，单位为秒，默认值为 `7200`，取值范围为 `-1` 和 [300,86400]。</p>
     *
     * <p>- 取值为 `-1` 时，表示不限制录制时长，录制结束后生成一个完整的录制文件。</p>
     *
     * <p>- 取值为 [300,86400] 之间的值时，表示根据设置的录制文件时长，到达时长立即生成录制文件，完成录制后一起上传。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 断流录制场景仅在录制格式为 HLS 时生效，且断流录制和实时录制为二选一配置。</p>
     *
     * <p>- 如录制过程中出现断流，对应生成的录制文件时长也会相应缩短。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>实时录制场景下，单文件录制时长，单位为秒，默认值为 `1800`，取值范围为 [300,21600]。录制时间到达设置的单文件录制时长时，会立即生成录制文件实时上传存储。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如录制过程中出现断流，对应生成的录制文件时长也会相应缩短。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RealtimeRecordDuration")
    private Integer realtimeRecordDuration;

    /**
     * <p>断流录制场景下，断流拼接时长，单位为秒，默认值为 `0`，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `-1`：一直拼接，表示每次断流都不会影响录制任务，录制完成后生成一个完整的录制文件；</p>
     *
     * <p>- `0`：不拼接，表示每次断流结束录制任务生成一个录制文件，断流恢复重新开始一个新的录制任务；</p>
     *
     * <p>- 大于 0：拼接容错时间，表示如果断流时间小于拼接容错时间时，则录制任务不会停止，不会生成新的录制文件；如果断流时间大于拼接容错时间，则录制任务停止，断流恢复后重新开始一个新的录制任务。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>断流录制场景仅在录制格式为 HLS 时生效，且断流录制和实时录制为二选一配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Splice")
    private Integer splice;

    /**
     * <p>TOS 存储相关配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>录制文件只能选择一个位置进行存储，即 `TOSParam` 和 `VODParam` 配置且配置其中一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TOSParam")
    private UpdateRecordPresetV2BodyRecordPresetConfigFlvParamTOSParam tOSParam;

    /**
     * <p>VOD 存储相关配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>录制文件只能选择一个位置进行存储，即 `TOSParam` 和 `VODParam` 配置且配置其中一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VODParam")
    private UpdateRecordPresetV2BodyRecordPresetConfigFlvParamVODParam vODParam;

    /**
     * <p>实时录制场景下，断流等待时长，单位为秒，默认值为 `180`，取值范围为 [0,3600]。如果实际断流时间小于断流等待时长，录制任务不会停止；如果实际断流时间大于断流等待时长，录制任务会停止，断流恢复后重新开始一个新的录制任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContinueDuration")
    private Integer continueDuration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
