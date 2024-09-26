package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * CreateAppImageBody
 */
@lombok.Data
public final class CreateAppImageBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>需要打包应用镜像的实例 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>实例上需要打包的应用包名列表，以“,”分隔。需确保应用已经正常安装。如应用未完成安装，则会导致任务部分失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageNameList")
    private List<String> packageNameList;

    /**
     * <p>是否在任务完成后，创建 AppVersion 及相关镜像：</p>
     *
     * <p>- 0：否；</p>
     *
     * <p>- 1：（默认）是。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAppVersion")
    private Integer createAppVersion;

    /**
     * <p>镜像本地存储路径。</p>
     *
     * <p>打包后生成的镜像可以存储在本地，用于所在机房内直接共享分发。该参数置空时，表示不本地存储，即镜像完成上传后，清理本地镜像。云端镜像以压缩包存储(默认 .tar.gz 格式)。本地以镜像目录存储，不保留压缩格式镜像文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LocalPath")
    private String localPath;

    /**
     * <p>Public 公有镜像，Private 私有镜像</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageMode")
    private String imageMode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
