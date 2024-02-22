package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostSnapshotAuditPresetResResultPresetListItemAuditPreset
 */
@lombok.Data
public final class ListVhostSnapshotAuditPresetResResultPresetListItemAuditPreset  {

    /**
     * <p>截图间隔时间，单位秒，取值范围为[0.1,10]，支持保留两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Float interval;

    /**
     * <p>截图审核配置的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>ToS 存储对应的 Bucket。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>ToS 存储对应的 Bucket 下的存储目录。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>截图审核结果回调地址配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<ListVhostSnapshotAuditPresetResResultPresetListItemAuditPresetCallbackDetailListItem> callbackDetailList;

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
     * <p>截图审核配置的描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>存储策略，取值及含义如下。</p>
     *
     * <p>- 0：触发存储，只存储有风险图片；</p>
     *
     * <p>- 1：全部存储，存储全部图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageStrategy")
    private Integer storageStrategy;

    /**
     * <p>审核标签名称，取值及含义如下。</p>
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

    /**
     * <p>配置信息的更新时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>存储方式为实时存储时的存储规则，支持以 {Domain}/{App}/{Stream}/{UnixTimestamp} 样式设置存储规则，支持输入字母、数字、"-"、"!"、"\_"、"."、"\*"及占位符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotObject")
    private String snapshotObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
