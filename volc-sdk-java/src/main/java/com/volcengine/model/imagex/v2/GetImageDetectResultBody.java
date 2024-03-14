package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageDetectResultBody
 */
@lombok.Data
public final class GetImageDetectResultBody  {

    /**
     * <p>指定服务下的待检测图片的 StoreUri 或者公网可访问 Url。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>检测类型，取值仅支持 `face`，表示检测图片中人脸所在坐标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetectType")
    private String detectType;

    /**
     * <p>当 DetectType 取值 `face` 时，为必填。</p>
     *
     *
     *
     * <p>人脸检测阈值，默认值为 0.52，取值范围为 (0,1)。值越高，对检测结果过滤越严格，召回率越低，精确率越高。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 阈值过低，表示图片中的检测样本较多，可能会导致非人脸样本被纳入检测范围，从而降低精确率。</p>
     *
     * <p>- 阈值过高，表示图片中的检测样本较少，可能导致样本漏检。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FaceDetectThresh")
    private Double faceDetectThresh;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
