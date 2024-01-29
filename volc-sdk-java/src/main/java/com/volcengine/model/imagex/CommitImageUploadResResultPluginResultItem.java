package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CommitImageUploadResResultPluginResultItem
 */
@lombok.Data
public final class CommitImageUploadResResultPluginResultItem  {

    /**
     * <p>图片文件名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileName")
    private String fileName;

    /**
     * <p>图片 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>图片的高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageHeight")
    private Integer imageHeight;

    /**
     * <p>图片的 MD5</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageMd5")
    private String imageMd5;

    /**
     * <p>图片的宽。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageWidth")
    private Integer imageWidth;

    /**
     * <p>图片格式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageFormat")
    private String imageFormat;

    /**
     * <p>图片大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageSize")
    private Integer imageSize;

    /**
     * <p>图片帧数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameCnt")
    private Integer frameCnt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
