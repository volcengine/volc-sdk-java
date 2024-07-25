package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * DetailPodResResult
 */
@lombok.Data
public final class DetailPodResResult  {

    /**
     * <p>实例所属业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>自定义实例名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    /**
     * <p>镜像 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>镜像名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageName")
    private String imageName;

    /**
     * <p>与实例绑定的标签信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tag")
    private com.volcengine.model.acep.v20231030.ResultTag tag;

    /**
     * <p>机房信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcInfo")
    private com.volcengine.model.acep.v20231030.ResultPodDc dcInfo;

    /**
     * <p>实例套餐信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Configuration")
    private com.volcengine.model.acep.v20231030.ResultConfiguration configuration;

    /**
     * <p>实例的用户存储分区大小，即 Data 分区容量大小。可选的容量如下：</p>
     *
     *
     *
     * <p>- 4Gi </p>
     *
     * <p>- 8Gi </p>
     *
     * <p>- 16Gi </p>
     *
     * <p>- 32Gi </p>
     *
     * <p>- 64Gi </p>
     *
     * <p>- 128Gi </p>
     *
     * <p>- 256Gi</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSize")
    private String dataSize;

    /**
     * <p>实例已使用的存储大小。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSizeUsed")
    private String dataSizeUsed;

    /**
     * <p>屏幕布局 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>屏幕推流状态。格式为 "key":"value"</p>
     *
     *
     *
     * <p>- key 为 String 类型，屏幕 ID；</p>
     *
     * <p>- value 为 Integer 类型，推流状态，具体状态见[Status](https://www.volcengine.com/docs/6394/658586#status-%E5%AE%9A%E4%B9%89) 定义。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 通过 [DetailPod](https://www.volcengine.com/docs/6394/1221464) 接口查询时返回。</p>
     *
     * <p>- 通过 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口查询时返回的值无实际意义，可忽略。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayStatus")
    private Map<String, Integer> displayStatus;

    /**
     * <p>ADB 地址。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>空表示未开启 ADB。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Adb")
    private String adb;

    /**
     * <p>代表实例 ADB 开启状态。取值如下：</p>
     *
     *
     *
     * <p>- `1`：开启</p>
     *
     * <p>- `2`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdbStatus")
    private Integer adbStatus;

    /**
     * <p>ADB 过期时间。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>小于等于 0 为无过期时间。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdbExpireTime")
    private Long adbExpireTime;

    /**
     * <p>实例在线状态。取值如下：</p>
     *
     *
     *
     * <p>- `0`：开机中</p>
     *
     * <p>- `1`：开机完成</p>
     *
     * <p>- `2`：关机完成</p>
     *
     * <p>- `3`：关机中</p>
     *
     * <p>- `4`：重启中</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Online")
    private Integer online;

    /**
     * <p>实例的内网 IP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IntranetIP")
    private String intranetIP;

    /**
     * <p>实例推流状态。取值如下：</p>
     *
     *
     *
     * <p>- `0`：空闲 </p>
     *
     * <p>- `1`：推流中 </p>
     *
     * <p>- `2`：就绪</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamStatus")
    private Integer streamStatus;

    /**
     * <p>实例上行带宽上限，单位为 Mbps；如设置为 0，则不限速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidthLimit")
    private Integer upBandwidthLimit;

    /**
     * <p>实例下行带宽上限，单位为 Mbps；如设置为 0，则不限速。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidthLimit")
    private Integer downBandwidthLimit;

    /**
     * <p>实例镜像版本。取值如下：</p>
     *
     *
     *
     * <p>- `10`：AOSP 10</p>
     *
     * <p>- `11`：AOSP 11</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AospVersion")
    private String aospVersion;

    /**
     * <p>实例创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>实例授权运维过期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityExpireTime")
    private Long authorityExpireTime;

    /**
     * <p>实例授权运维状态。取值如下：</p>
     *
     *
     *
     * <p>- `1`：未授权</p>
     *
     * <p>- `2`：已授权</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityStatus")
    private Integer authorityStatus;

    /**
     * <p>端口映射列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleList")
    private List<com.volcengine.model.acep.v20231030.ResultPortMappingRule> portMappingRuleList;

    /**
     * <p>云机 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>云机规格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

    /**
     * <p>壁纸流房间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewRoomId")
    private String previewRoomId;

    /**
     * <p>壁纸流引擎</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewStreamProvider")
    private String previewStreamProvider;

    /**
     * <p>壁纸流状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewStreamStatus")
    private Integer previewStreamStatus;

    /**
     * <p>软件版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SoftwareVersion")
    private String softwareVersion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
