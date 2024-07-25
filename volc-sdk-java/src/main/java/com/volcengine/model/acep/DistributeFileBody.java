package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DistributeFileBody
 */
@lombok.Data
public final class DistributeFileBody  {

    /**
     * <p>实例所归属的业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID 列表，指定该参数时，对多个实例批量执行文件分发操作。支持批量操作的实例数上限为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>需要保存在实例内的文件名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileName")
    private String fileName;

    /**
     * <p>文件 md5 值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileMd5")
    private String fileMd5;

    /**
     * <p>文件下载链接。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>目标存储路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TargetDirectory")
    private String targetDirectory;

    /**
     * <p>分发 `.zip/.tar` 文件后，是否自动解压缩文件：</p>
     *
     * <p>- 0：（默认设置）自动解压文件；</p>
     *
     * <p>- 1：不自动解压文件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoUnzip")
    private Integer autoUnzip;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
