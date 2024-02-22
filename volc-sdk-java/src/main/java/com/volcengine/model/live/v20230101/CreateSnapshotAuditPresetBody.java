package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateSnapshotAuditPresetBody
 */
@lombok.Data
public final class CreateSnapshotAuditPresetBody  {

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
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>截图间隔时间，单位为秒，取值范围为 [0.1,10]，支持保留两位小数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Float interval;

    /**
     * <p>TOS 存储对应的 Bucket。</p>
     *
     * <p>例如，存储路径为 live-test-tos-example/live/liveapp 时，Bucket 取值为 live-test-tos-example。</p>
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
     * <p>ToS 存储对应的 bucket 下的存储目录，默认为空。</p>
     *
     * <p>例如，存储位置为 live-test-tos-example/live/liveapp 时，StorageDir 取值为 live/liveapp。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>截图审核结果回调地址配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<CreateSnapshotAuditPresetBodyCallbackDetailListItem> callbackDetailList;

    /**
     * <p>veImageX 的服务 ID。</p>
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
     * <p>存储策略，支持的取值及含义如下。</p>
     *
     * <p>- 0：触发存储，只存储有风险图片；</p>
     *
     * <p>- 1：全部存储，存储所有图片。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageStrategy")
    private Integer storageStrategy;

    /**
     * <p>审核标签，缺省情况下取值为 301、302、303、305 和 306，支持的取值及含义如下。</p>
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
     * <p>截图存储规则，支持以 {Domain}/{App}/{Stream}/{UnixTimestamp} 样式设置存储规则，支持输入字母、数字、-、!、\_、.、\* 及占位符，最大长度为 180 个字符，默认值为 {audit}/{PushDomain}/{App}/{Stream}/{UnixTimestamp}。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotObject")
    private String snapshotObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
