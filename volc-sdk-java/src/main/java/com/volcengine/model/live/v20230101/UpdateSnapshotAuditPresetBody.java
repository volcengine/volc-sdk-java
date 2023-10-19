package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateSnapshotAuditPresetBody
 */
@lombok.Data
public final class UpdateSnapshotAuditPresetBody  {

    /**
     * <p>域名空间名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>App 名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图间隔时间，单位秒，取值范围为[0.1,10]，支持保留两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Float interval;

    /**
     * <p>审核模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>ToS 存储空间 bucket。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Bucket` 和 `ServiceID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>ToS 存储空间 bucket 下的存储目录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>审核结果回调配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<UpdateSnapshotAuditPresetBodyCallbackDetailListItem> callbackDetailList;

    /**
     * <p>veimageX 的服务 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Bucket` 和 `ServiceID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>审核模板描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>存储策略。支持以下取值。</p>
     *
     * <p>- 0：触发存储，只存储有风险图片；</p>
     *
     * <p>- 1：全部存储，存储全部图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageStrategy")
    private Integer storageStrategy;

    /**
     * <p>审核标签名称，若为空，则默认请求所有基础模型。支持以下取值。</p>
     *
     * <p>- 301：涉黄；</p>
     *
     * <p>- 302：涉敏1；</p>
     *
     * <p>- 303：涉敏2；</p>
     *
     * <p>- 304：广告；</p>
     *
     * <p>- 305：引人不适；</p>
     *
     * <p>- 306：违禁；</p>
     *
     * <p>- 307：二维码；</p>
     *
     * <p>- 308：诈骗；</p>
     *
     * <p>- 309：不良画面；</p>
     *
     * <p>- 310：未成年相关；</p>
     *
     * <p>- 320：文字违规。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Label")
    private List<String> label;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
