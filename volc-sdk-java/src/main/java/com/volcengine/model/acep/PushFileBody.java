package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * PushFileBody
 */
@lombok.Data
public final class PushFileBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>需要推送文件的实例 ID 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>（TosBucket 填写时，必填）存储桶下的目录或文件名称（不能以 / 开头），正确示例：`cloudphone/gameApk/my_photo.jpg`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosFilePath")
    private String tosFilePath;

    /**
     * <p>（TosBucket 填写时，必填）对象存储服务地址，例如：`tos-cn-beijing.volces.com`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>（TosBucket 填写时，必填）对象存储服务区域，例如：`cn-beijing`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>从对象存储推送文件到云手机实例，指定保存源文件的火山引擎对象存储中的存储桶名称，例如：`test-bucket`。</p>
     *
     *
     *
     * <p>> 说明：与 `DownloadUrl` 二选一，如果 `TosBucket` 填写，则会忽略 `DownloadUrl` 参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosBucket")
    private String tosBucket;

    /**
     * <p>推送文件的文件名：</p>
     *
     *
     *
     * <p>- 如果通过下载链接（DownloadUrl）推送文件，则必填；</p>
     *
     * <p>	</p>
     *
     * <p>- 如果通过火山引擎对象存储（TOS）推送文件，则非必填。</p>
     *
     *
     *
     * <p>> 说明：如重复上传同名文件，已有文件将被覆盖。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileName")
    private String fileName;

    /**
     * <p>从下载链接推送文件到云手机实例。</p>
     *
     * <p>> 与 TOS 上传二选一，如果 `TosBucket` 为空则此参数生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>推送文件至云手机实例中的目标路径（不包括文件名），支持的目标路径包括以下目录：</p>
     *
     *
     *
     * <p>- /sdcard/</p>
     *
     * <p>	</p>
     *
     * <p>- /data/local/</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TargetDirectory")
    private String targetDirectory;

    /**
     * <p>是否自动解压推送的压缩文件：</p>
     *
     *
     *
     * <p>- 0：推送 zip 文件后，自动解压文件（默认）；</p>
     *
     * <p>- 1：推送 zip 文件后，不自动解压文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoUnzip")
    private Integer autoUnzip;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
