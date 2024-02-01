package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * PreviewImageUploadFileResResult
 */
@lombok.Data
public final class PreviewImageUploadFileResResult  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>文件 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>图片格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageFormat")
    private String imageFormat;

    /**
     * <p>图片字节数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageSize")
    private Integer imageSize;

    /**
     * <p>图片宽度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageWidth")
    private Integer imageWidth;

    /**
     * <p>图片高度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageHeight")
    private Integer imageHeight;

    /**
     * <p>图片帧数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageFrames")
    private Integer imageFrames;

    /**
     * <p>图片播放时间，单位为毫秒，仅当图片为动态图时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageDuration")
    private Integer imageDuration;

    /**
     * <p>底层存储的content-type值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageContentType")
    private String storageContentType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
