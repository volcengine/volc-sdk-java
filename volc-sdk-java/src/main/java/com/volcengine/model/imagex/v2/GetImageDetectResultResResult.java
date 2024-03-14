package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageDetectResultResResult
 */
@lombok.Data
public final class GetImageDetectResultResResult  {

    /**
     * <p>人脸识别结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Faces")
    private List<GetImageDetectResultResResultFacesItem> faces;

    /**
     * <p>检测类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetectType")
    private String detectType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
