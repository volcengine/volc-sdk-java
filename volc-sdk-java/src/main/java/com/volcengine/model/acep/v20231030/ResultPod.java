package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * ResultPod
 */
@lombok.Data
public final class ResultPod  {

    /**
     * <p>ADB 地址，空表示未开启 ADB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Adb")
    private String adb;

    /**
     * <p>eip信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Eip")
    private ResultEip eip;

    /**
     * <p>与实例绑定的标签信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tag")
    private ResultTag tag;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DNSId")
    private String dNSId;

    /**
     * <p>实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>机房信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DcInfo")
    private ResultPodDc dcInfo;

    /**
     * <p>云机 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

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
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SNATId")
    private String sNATId;

    /**
     * <p>镜像 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>自定义实例名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodName")
    private String podName;

    /**
     * <p>实例创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>创建实例的用户存储分区大小，即 data 分区容量大小，可选的容量如下：</p>
     *
     *
     *
     * <p>- 4Gi</p>
     *
     * <p>- 8Gi</p>
     *
     * <p>- 16Gi</p>
     *
     * <p>- 32Gi</p>
     *
     * <p>- 64Gi</p>
     *
     * <p>- 128Gi</p>
     *
     * <p>- 256Gi</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSize")
    private String dataSize;

    /**
     * <p>ADB 预期打开状态</p>
     *
     *
     *
     * <p>- `0`：关闭</p>
     *
     * <p>- `1`：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdbStatus")
    private Integer adbStatus;

    /**
     * <p>cidr段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CidrBlock")
    private String cidrBlock;

    /**
     * <p>镜像名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageName")
    private String imageName;

    /**
     * <p>实例所属业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例的内网 IP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IntranetIP")
    private String intranetIP;

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
     * <p>- 支持配置白名单IP，对白名单IP不限速。同时对pod访问的其他IP进行整体限速</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPWhiteList")
    private String iPWhiteList;

    /**
     * <p>已使用的实例用户存储分区大小。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataSizeUsed")
    private String dataSizeUsed;

    /**
     * <p>实例推流状态。取值如下：</p>
     *
     *
     *
     * <p>- `0`：空闲</p>
     *
     * <p>- `1`：推流中</p>
     *
     * <p>- `2`：就绪</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamStatus")
    private Integer streamStatus;

    /**
     * <p>ADB 过期时间。小于等于 0 为无过期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdbExpireTime")
    private Long adbExpireTime;

    /**
     * <p>实例规格信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Configuration")
    private ResultConfiguration configuration;

    /**
     * <p>屏幕布局信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayout")
    private ResultDisplayLayout displayLayout;

    /**
     * <p>屏幕推流状态。取值如下：</p>
     *
     *
     *
     * <p>- key 为屏幕 ID；</p>
     *
     * <p>- value 为推流状态，具体状态见[Status 定义](https://www.volcengine.com/docs/6394/658586#status-%E5%AE%9A%E4%B9%89)</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>- 通过 [DetailPod](https://www.volcengine.com/docs/6394/1221464) 接口查询时返回。</p>
     *
     * <p>- 通过 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口查询时返回的值无实际意义，可忽略。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayStatus")
    private Map<String, Integer> displayStatus;

    /**
     * <p>数据库中的实例属性</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodPropertyDB")
    private ResultGetPodPropertyResult podPropertyDB;

    /**
     * <p>壁纸流房间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewRoomId")
    private String previewRoomId;

    /**
     * <p>云机规格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerTypeCode")
    private String serverTypeCode;

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
     * <p>屏幕布局 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>软件版本</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SoftwareVersion")
    private String softwareVersion;

    /**
     * <p>实例上行带宽上限，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidthLimit")
    private Integer upBandwidthLimit;

    /**
     * <p>实例下行带宽上限，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownBandwidthLimit")
    private Integer downBandwidthLimit;

    /**
     * <p>实例授权运维过期时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthorityExpireTime")
    private Long authorityExpireTime;

    /**
     * <p>端口映射列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleList")
    private List<ResultPortMappingRule> portMappingRuleList;

    /**
     * <p>壁纸流状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewStreamStatus")
    private Integer previewStreamStatus;

    /**
     * <p>壁纸流引擎</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreviewStreamProvider")
    private String previewStreamProvider;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
