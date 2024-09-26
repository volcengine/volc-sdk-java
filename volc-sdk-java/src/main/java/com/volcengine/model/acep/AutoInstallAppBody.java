package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * AutoInstallAppBody
 */
@lombok.Data
public final class AutoInstallAppBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>下载应用安装文件的地址。</p>
     *
     * <p>使用机身存储独立安装，即 InstallType 设为 0 时必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadURL")
    private String downloadURL;

    /**
     * <p>指定实例 ID 列表进行应用安装。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>- `InstallType` 为 0 时，传入应用安装文件的 MD5 值，必须与下载的应用安装文件匹配。</p>
     *
     * <p>- `InstallType` 为 1 时，传入镜像包的 MD5 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MD5")
    private String mD5;

    /**
     * <p>应用包名。`InstallType` 为 1 时必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>- `InstallType` 为 0 时：选填。应用在实例中的绝对路径。当指定了该参数时，优先使用实例中的安装包路径安装应用，否则使用下载链接进行安装。</p>
     *
     * <p>- `InstallType` 为 1 时：必填。应用镜像存储的根目录，如 `/ceph`，`/apkserver`，`/data/app-image`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AbsolutePath")
    private String absolutePath;

    /**
     * <p>镜像包 ID。`InstallType` 为 1 时必填。示例：`com.abc.tmp.app_ddfklidkfa`，其中 “`ddfklidkfa`” 为镜像包 MD5 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>应用安装方式：</p>
     *
     * <p>- 0：（默认值）机身存储独立安装；</p>
     *
     * <p>- 1：应用镜像安装。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InstallType")
    private Integer installType;

    /**
     * <p>应用版本号。`InstallType` 为 1 时必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionCode")
    private Integer versionCode;

    /**
     * <p>用于标记该应用是否为预安装应用：</p>
     *
     *
     *
     * <p>- true：是；</p>
     *
     *
     *
     * <p>- false：否。</p>
     *
     *
     *
     * <p>当标记某应用为预安装应用后，重置实例时可选择是否保留该应用及相关数据。具体参看 [ResetPod](https://www.volcengine.com/docs/6394/1221459) 接口的 `PreInstallAppPersistedType` 字段说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsPreinstall")
    private Boolean isPreinstall;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
