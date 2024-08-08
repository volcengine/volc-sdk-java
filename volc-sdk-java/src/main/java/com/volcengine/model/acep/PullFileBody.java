package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * PullFileBody
 */
@lombok.Data
public final class PullFileBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 `ListPod` 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>火山引擎对象存储中的存储桶名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosBucket")
    private String tosBucket;

    /**
     * <p>存储桶下保存文件的完整路径，包括文件名，并且指定的路径必须存在（不能以 / 开头），例如：`cloudphone/screen_record/record.mp4`</p>
     *
     *
     *
     * <p>> 说明：当下载文件夹时，会将文件夹以 .zip 文件的格式下载，`TosFilePath` 也要指定为以 .zip 文件格式结尾。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosFilePath")
    private String tosFilePath;

    /**
     * <p>对象存储服务地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Endpoint")
    private String endpoint;

    /**
     * <p>对象存储服务区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>实例中待下载文件的路径或文件名，支持从以下路径下载文件：</p>
     *
     *
     *
     * <p>- /sdcard/</p>
     *
     * <p>	</p>
     *
     * <p>- /data/misc/logd/ + 日志文件名/</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FilePath")
    private String filePath;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
