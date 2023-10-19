package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2BodyRecordPresetConfigMp4ParamTOSParam
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfigMp4ParamTOSParam  {

    /**
     * <p>是否使用 TOS 存储，默认为 false，取值及含义如下所示。</p>
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
     * <p>TOS 存储空间，一般使用 CDN 对应的 Bucket</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果 TOSParam 中的 Enable 取值为 true，则 Bucket 必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>TOS 存储目录，默认为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>录制文件的存储位置。存储路径为 `record/{PubDomain}/{App}/{Stream}/{StartTime}_{EndTime}`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
