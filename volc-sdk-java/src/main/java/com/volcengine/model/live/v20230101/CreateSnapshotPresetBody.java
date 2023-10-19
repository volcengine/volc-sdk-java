package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateSnapshotPresetBody
 */
@lombok.Data
public final class CreateSnapshotPresetBody  {

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>ToS 存储的 Bucket。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Bucket` 与 `ServiceID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>回调详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<CreateSnapshotPresetBodyCallbackDetailListItem> callbackDetailList;

    /**
     * <p>截图间隔时间，单位为 s，默认值为 10，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>veImageX 的服务 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Bucket` 与 `ServiceID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>截图格式。默认值为 jpeg，支持如下取值。</p>
     *
     * <p>- jpeg</p>
     *
     * <p>- png</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotFormat")
    private String snapshotFormat;

    /**
     * <p>存储规则。存储在 ToS 时传，格式为`{PushDomain}/{App}/{Stream}/{UnixTimestamp}`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotObject")
    private String snapshotObject;

    /**
     * <p>截图模版状态状态。默认开启。</p>
     *
     * <p>* 1：开启。</p>
     *
     * <p>* 0：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>ToS 存储目录，不传为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
